package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Reply;
import com.sunqiao.myblog.mapper.ReplyMapper;
import com.sunqiao.myblog.service.ReplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Override
    public int insertReply(String comId, String userIp, String blogId, String replyContent, String replyState, String cName, String eAdd, String personal, String level) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String replyDate = sdf.format(now);

        Reply reply =new Reply(comId,userIp,blogId,replyContent,replyDate,replyState,cName,eAdd,personal,level);
        int i = replymapper.insertReply(reply);
        if (i != 1) {
            System.out.println("新增回复出错");
        }

        return 1;
    }

    @Override
    public int updateReply(Integer id, String replyContent, String cName, String eAdd) {

        Reply reply = new Reply(id,replyContent,cName,eAdd);
        int i = replymapper.updateReply(reply);

        if (i != 1) {
            System.out.println("修改回复出错");
        }
        return 1;
    }

    @Override
    public int deleteReply(Integer id) {
        int i = replymapper.deleteReply(id);

        if (i != 1) {
            System.out.println("删除回复出错");
        }
        return 1;
    }

}
