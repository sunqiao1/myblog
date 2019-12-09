package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Comment;
import com.sunqiao.myblog.bean.Link;
import com.sunqiao.myblog.mapper.CommentMapper;
import com.sunqiao.myblog.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:04
 * @Since 2019
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    CommentMapper commentMapper;




    @Override
    public List<Map> getComment() {
        List<Map> list = commentMapper.getComment();
        return list;
    }

    @Transactional
    @Override
    public int insertComment(String userIp,String blogId,String content,String state,String nickName,String mailAddress,String personal) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String commentDate = sdf.format(now);

        Comment comment = new Comment(userIp,blogId,content,state,nickName,mailAddress,personal,commentDate);
        int i = commentMapper.insertComment(comment);


        if (i != 1) {
            System.out.println("新增评论有误");
        }

        return 1;
    }


    @Override
    public int deleteComment(Integer id) {
        int i = commentMapper.deleteComment(id);
        if(i!=1){
            System.out.println("删除评论失败");
        }

        return 1;
    }
}
