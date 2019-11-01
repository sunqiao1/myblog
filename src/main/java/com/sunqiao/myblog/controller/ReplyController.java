package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Reply;
import com.sunqiao.myblog.service.ReplyService;
import com.sunqiao.myblog.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:49
 * @Since 2019
 */
@Controller
public class ReplyController {

    @Resource
    ReplyService replyService;

    @GetMapping("/reply/{id}")
    @ResponseBody
    public Reply getReplyById(@PathVariable("id") Integer id){
        Reply reply = replyService.getReplyById(id);
        return reply;
    }

    @GetMapping("/reply/insert")
    @ResponseBody()
    public JsonResult insertReply(String comId, String userIp, String blogId, String replyContent, String replyState, String cName, String eAdd, String personal, String level){
        int i = replyService.insertReply(comId,userIp,blogId,replyContent,replyState,cName,eAdd,personal,level);

        return  new JsonResult(i);
    }

    @GetMapping("/reply/update")
    @ResponseBody()
    public JsonResult updateReply(Integer id, String replyContent, String cName, String eAdd){
        int i = replyService.updateReply(id,replyContent,cName,eAdd);

        return  new JsonResult(i);
    }

    @GetMapping("/reply/delete")
    @ResponseBody()
    public JsonResult deleteReply(Integer id){
        int i  = replyService.deleteReply(id);

        return  new JsonResult(i);
    }

}
