package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.BlogLog;
import com.sunqiao.myblog.service.BlogLogService;
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
 * @Date 2019-10-25 12:01
 * @Since 2019
 */
@RequestMapping("/blogLog")
@Controller
public class BlogLogController {

    @Resource
    BlogLogService blogLogService;

    @GetMapping("/log")
    @ResponseBody
    public JsonResult getBlogLogByLid(){
        List<Map> list = blogLogService.getBlogLogByLid();
        return new JsonResult(list);
    }

    @GetMapping("/addlog")
    @ResponseBody
    public JsonResult insertBlogLog(String info){
        int i = blogLogService.insertBlogLog(info);
        return new JsonResult(i);
    }

    @GetMapping("/updatelog")
    @ResponseBody
    public JsonResult updateBlogLog(Integer lid,String info){

        int i =blogLogService.updateBlogLog(lid,info);
        return new JsonResult(i);
    }

    @GetMapping("/deletelog")
    @ResponseBody
    public JsonResult deleteBlogLog(Integer lid){
        int i = blogLogService.deleteBlogLog(lid);
        return  new JsonResult(i);
    }

}
