package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Blog;
import com.sunqiao.myblog.service.BlogService;
import com.sunqiao.myblog.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 19:22
 * @Since 2019
 */
@Api(value = "博文",tags = "博文具体信息")
@RequestMapping("/blog")
@RestController
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
    @ApiOperation(value = "查找",notes = "展示博文列表")
    @GetMapping("/list")
    public JsonResult getBlogMapper(){
        List<Map> list = blogService.getBlogMapper();
        return new JsonResult(list);
    }


    @ApiOperation(value = "新增",notes = "新增博文")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title",value = "标题",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "content",value = "内容",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "summary",value = "简介",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "author",value = "作者",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "imgName",value = "封面",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "typeName",value = "博文类型",dataType = "string",paramType = "query")
    })
    @PostMapping("/addBlog")
    public JsonResult insertBlog(String title,String content,String summary,String author,String imgName,String typeName){
        int i = blogService.insertBlog(title, author, summary, imgName, content, typeName);
        return  new JsonResult(i);
    }


    @ApiOperation(value = "修改",notes = "修改博文")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "通过此id来对博文进行修改",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "title",value = "标题",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "content",value = "内容",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "summary",value = "简介",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "imgName",value = "封面",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "typeName",value = "博文类型",dataType = "string",paramType = "query")
    })
    @PutMapping("/updateblog")
    public JsonResult updateBlog(Integer id,String title, String summary, String imgName, String typeName,String content){
        boolean flag = blogService.updateBlog(id,title,summary,imgName,typeName,content);
        return  new JsonResult(flag);
    }


    @ApiOperation(value = "删除",notes = "删除博文")
    @ApiImplicitParam(name = "id",value = "博文id",dataType = "string",paramType = "query")
    @DeleteMapping("/deleteblog")
    public JsonResult deleteBlog(Integer id){
        int i = blogService.deleteBlog(id);
        return new JsonResult(i);
    }

}
