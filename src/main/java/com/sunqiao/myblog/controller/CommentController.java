package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Comment;
import com.sunqiao.myblog.service.CommentService;
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
 * @Date 2019-10-25 14:08
 * @Since 2019
 */
@Api(value = "评论",tags = "评论具体信息")
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Resource
    CommentService commentService;


    @ApiOperation(value = "查询",notes = "通过id查询评论")
    @GetMapping("/select")
    public JsonResult getComment(){
        List<Map> list = commentService.getComment();
        return new JsonResult(list);
    }


    @ApiOperation(value = "新增",notes = "新增评论")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userIp",value = "用户ip地址",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "blogId",value = "博文id",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "content",value = "评论内容",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "state",value = "评论状态",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "nickName",value = "昵称",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "mailAddress",value = "邮箱地址",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "personal",value = "个人网站",dataType = "string",paramType = "query")
    })
    @PostMapping("/insert")
    public JsonResult insertComment(String userIp,String blogId,String content,String state,String nickName,String mailAddress,String personal){
        int i = commentService.insertComment(userIp,blogId,content,state,nickName,mailAddress,personal);

        return  new JsonResult(i);
    }


    @ApiOperation(value = "删除",notes = "通过id删除评论")
    @ApiImplicitParam(name = "id",value = "评论id",dataType = "string",paramType = "query")
    @DeleteMapping("/delete")
    public JsonResult deleteComment(Integer id){
        int i = commentService.deleteComment(id);
        return new JsonResult(i);
    }
}
