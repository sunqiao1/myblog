package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.BlogType;
import com.sunqiao.myblog.service.BlogTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 20:23
 * @Since 2019
 */

@Controller
public class BlogTypeController {

    @Resource
    BlogTypeService blogTypeService;

    @GetMapping("/blogType/{id}")
    @ResponseBody
    public BlogType getBlogTypeService(@PathVariable("id")  Integer id){
        BlogType blogType = blogTypeService.getBlogTypeByIdService(id);
        return blogType;
    }


}
