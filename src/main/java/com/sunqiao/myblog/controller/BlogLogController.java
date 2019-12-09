package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.BlogLog;
import com.sunqiao.myblog.service.BlogLogService;
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
 * get查询
 * post提交增加
 * put修改
 * delete删除
 * @author SUNQIAO
 * @Date 2019-10-25 12:01
 * @Since 2019
 */
@Api(value = "博客日志",tags = "博客日志具体信息")
@RequestMapping("/blogLog")
@RestController
public class BlogLogController {

    @Resource
    BlogLogService blogLogService;

    @ApiOperation(value = "查询",notes = "通过id查询博客日志")
    @GetMapping("/log")
    public JsonResult getBlogLogByLid(){
        List<Map> list = blogLogService.getBlogLogByLid();
        return new JsonResult(list);
    }


    @ApiOperation(value = "增加",notes = "新增博客日志")
    @ApiImplicitParam(name = "info",value = "博客日志信息",dataType = "string",paramType = "query")
    @PostMapping("/addlog")
    public JsonResult insertBlogLog(String info){
        int i = blogLogService.insertBlogLog(info);
        return new JsonResult(i);
    }


    @ApiOperation(value = "修改",notes = "修改博客日志")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "lid",value = "通过此lid来对博客日志进行修改",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "info",value = "博客日志信息",dataType = "string",paramType = "query")
    })
    @PutMapping("/updatelog")
    public JsonResult updateBlogLog(Integer lid,String info){

        int i =blogLogService.updateBlogLog(lid,info);
        return new JsonResult(i);
    }


    @ApiOperation(value = "删除",notes = "删除博客日志")
    @ApiImplicitParam(name = "id",value = "博客日志id",dataType = "string",paramType = "query")
    @DeleteMapping("/deletelog")
    public JsonResult deleteBlogLog(Integer lid){
        int i = blogLogService.deleteBlogLog(lid);
        return  new JsonResult(i);
    }

}
