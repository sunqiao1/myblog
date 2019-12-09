package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.BlogType;
import com.sunqiao.myblog.service.BlogTypeService;
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
 * @Date 2019-10-24 20:23
 * @Since 2019
 */
@Api(value = "博文类型",tags = "博文类型具体信息")
@RequestMapping("/blogType")
@RestController
public class BlogTypeController {

    @Resource
    BlogTypeService blogTypeService;


    @ApiOperation(value = "查询",notes = "查询博文类型")
    @GetMapping("/type")
    public JsonResult getBlogTypeById(){
        List<Map> list = blogTypeService.getBlogTypeById();
        return new JsonResult(list);
    }


    @ApiOperation(value = "新增",notes = "新增博文类型")
    @ApiImplicitParam(name = "typeName",value = "博文类型",dataType = "string",paramType = "query")
    @PostMapping("/inserttype")
    public JsonResult insertBlogType(String typeName){
        int i = blogTypeService.insertBlogType(typeName);
        return  new JsonResult(i);

    }


    @ApiOperation(value = "修改",notes = "修改博文类型")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "通过此id来对博文类型进行修改",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "typeName",value = "博文类型",dataType = "string",paramType = "query")
    })
    @PutMapping("/updatetype")
    public JsonResult updateBlogType(Integer id,String typeName){
        int i = blogTypeService.updateBlogType(id,typeName);
        return  new JsonResult(i);

    }


    @ApiOperation(value = "删除",notes = "删除博文类型")
    @ApiImplicitParam(name = "id",value = "博文类型id",dataType = "string",paramType = "query")
    @DeleteMapping("/deletetype")
    public JsonResult deleteBlogType(Integer id){
        int i = blogTypeService.deleteBlogType(id);
        return  new JsonResult(i);

    }


}
