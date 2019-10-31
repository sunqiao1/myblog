package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Blog;
import com.sunqiao.myblog.service.BlogService;
import com.sunqiao.myblog.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 19:22
 * @Since 2019
 */
@RequestMapping("/blog")
@Controller
public class BlogController {
    //注入业务层接口
    @Resource
    BlogService blogService;

/**
 * //
 * （GetMapping这个相当于暴露接口给浏览器使用【也就是给前端使用】，@ResponseBody是返回的JSON对象，用于前后端交互数据的），
 * 浏览器输入请求路径,首先控制层接收请求，然后因为控制层是由业务层接口注入的，所以再转回到业务层（Service接口），
 * 接着又因为业务层是由持久层接口注入的，所以然后再转回到持久层（Mapper/Dao）
 * 持久层是由mybatis结合sql映射实现接口，将查询的结果返回给bean对象也就是实体类，最后将结果以JSON的形式呈现在浏览器上
 *
 */


    @GetMapping("/list")
    @ResponseBody
    public JsonResult getBlogMapper(){
        List<Map> list = blogService.getBlogMapper();
        return new JsonResult(list);
    };
    @GetMapping("/addBlog")
    @ResponseBody
    public JsonResult insertBlog(String title,String content,String summary,String author,String imgName,String typeName){
        int i = blogService.insertBlog(title, author, summary, imgName, content, typeName);
        return  new JsonResult(i);
    }

    @GetMapping("/updateblog")
    @ResponseBody
    public JsonResult updateBlog(Integer id,String title, String summary, String imgName, String typeName,String content){
        boolean flag = blogService.updateBlog(id,title,summary,imgName,typeName,content);
        return  new JsonResult(flag);
    }

    @GetMapping("/deleteblog")
    @ResponseBody
    public JsonResult deleteBlog(Integer id){
        int i = blogService.deleteBlog(id);
        return new JsonResult(i);
    }

}
