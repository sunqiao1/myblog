package com.sunqiao.myblog.service;

import com.sunqiao.myblog.bean.Reply;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:42
 * @Since 2019
 */
public interface  ReplyService {
    public Reply getReplyById(Integer id);

    int insertReply(String comId, String userIp, String blogId, String replyContent, String replyState, String cName, String eAdd, String personal, String level);

    int updateReply(Integer id,String replyContent, String cName, String eAdd);

    int deleteReply(Integer id);


}
