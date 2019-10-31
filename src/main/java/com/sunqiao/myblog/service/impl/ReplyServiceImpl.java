package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Reply;
import com.sunqiao.myblog.mapper.ReplyMapper;
import com.sunqiao.myblog.service.ReplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:46
 * @Since 2019
 */

@Service
public class ReplyServiceImpl implements ReplyService {

    @Resource
    ReplyMapper replymapper;

    public Reply getReplyById(Integer id){
        Reply reply = replymapper.getReplyById(id);
        return reply;
    }

}
