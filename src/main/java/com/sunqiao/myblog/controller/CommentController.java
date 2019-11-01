package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Comment;
import com.sunqiao.myblog.service.CommentService;
import com.sunqiao.myblog.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:08
 * @Since 2019
 */

@Controller
public class CommentController {

    @Resource
    CommentService commentService;

    @GetMapping("/comment/select")
    @ResponseBody
    public JsonResult getComment(){
        List<Map> list = commentService.getComment();
        return new JsonResult(list);
    }

    @GetMapping("/comment/delete")
    @ResponseBody
    public JsonResult deleteComment(Integer id){
        int i = commentService.deleteComment(id);
        return new JsonResult(i);
    }
}
