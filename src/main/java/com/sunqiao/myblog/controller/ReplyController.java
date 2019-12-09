package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Reply;
import com.sunqiao.myblog.service.ReplyService;
import com.sunqiao.myblog.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:49
 * @Since 2019
 */
@Api(value = "回复",tags = "回复具体信息")
@RestController
@RequestMapping("/reply")
public class ReplyController {

    @Resource
    ReplyService replyService;


    @ApiOperation(value = "查询",notes = "查询回复")
    @ApiImplicitParam(name = "id",value = "回复id",dataType = "string",paramType = "query")
    @GetMapping("/{id}")
    public Reply getReplyById(@PathVariable("id") Integer id){
        Reply reply = replyService.getReplyById(id);
        return reply;
    }


    @ApiOperation(value = "新增",notes = "新增回复")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "comId",value = "评论id",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "userIp",value = "用户ip",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "blogId",value = "博文id",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "replyContent",value = "回复内容",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "replyState",value = "回复状态",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "cName",value = "回复昵称",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "eAdd",value = "邮箱地址",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "personal",value = "个人网站",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "level",value = "等级",dataType = "string",paramType = "query")
    })
    @PostMapping("/insert")
    public JsonResult insertReply(String comId, String userIp, String blogId, String replyContent, String replyState, String cName, String eAdd, String personal, String level){
        int i = replyService.insertReply(comId,userIp,blogId,replyContent,replyState,cName,eAdd,personal,level);

        return  new JsonResult(i);
    }


    @ApiOperation(value = "修改",notes = "修改回复")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "通过此id来对用户进行修改",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "replyContent",value = "回复内容",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "cName",value = "回复昵称",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "eAdd",value = "邮箱地址",dataType = "string",paramType = "query")
    })
    @PutMapping("/update")
    public JsonResult updateReply(Integer id, String replyContent, String cName, String eAdd){
        int i = replyService.updateReply(id,replyContent,cName,eAdd);

        return  new JsonResult(i);
    }


    @ApiOperation(value = "删除",notes = "通过id删除回复")
    @ApiImplicitParam(name = "id",value = "用户id",dataType = "string",paramType = "query")
    @DeleteMapping("/delete")
    public JsonResult deleteReply(Integer id){
        int i  = replyService.deleteReply(id);

        return  new JsonResult(i);
    }

}
