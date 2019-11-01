package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.BlogType;
import com.sunqiao.myblog.service.BlogTypeService;
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
 * @Date 2019-10-24 20:23
 * @Since 2019
 */
@RequestMapping("/blogType")
@Controller
public class BlogTypeController {

    @Resource
    BlogTypeService blogTypeService;

    @GetMapping("/type")
    @ResponseBody
    public JsonResult getBlogTypeById(){
        List<Map> list = blogTypeService.getBlogTypeById();
        return new JsonResult(list);
    }

    @GetMapping("/inserttype")
    @ResponseBody
    public JsonResult insertBlogType(String typeName){
        int i = blogTypeService.insertBlogType(typeName);
        return  new JsonResult(i);

    }

    @GetMapping("/updatetype")
    @ResponseBody
    public JsonResult updateBlogType(Integer id,String typeName){
        int i = blogTypeService.updateBlogType(id,typeName);
        return  new JsonResult(i);

    }

    @GetMapping("/deletetype")
    @ResponseBody
    public JsonResult deleteBlogType(Integer id){
        int i = blogTypeService.deleteBlogType(id);
        return  new JsonResult(i);

    }


}
