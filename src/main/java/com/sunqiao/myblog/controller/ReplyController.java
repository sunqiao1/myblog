package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Reply;
import com.sunqiao.myblog.service.ReplyService;
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
}
