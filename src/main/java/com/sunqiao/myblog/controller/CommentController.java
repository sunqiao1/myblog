package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Comment;
import com.sunqiao.myblog.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:08
 * @Since 2019
 */

@Controller
public class CommentController {

    @Resource
    CommentService commentService;

    @GetMapping("/comment/{id}")
    @ResponseBody
    public Comment getCommentById(@PathVariable("id")  Integer id){
        Comment comment = commentService.getCommentById(id);
        return comment;
    }
}
