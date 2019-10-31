package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Comment;
import com.sunqiao.myblog.mapper.CommentMapper;
import com.sunqiao.myblog.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:04
 * @Since 2019
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    CommentMapper commentMapper;

    public Comment getCommentById(Integer id){
        Comment comment = commentMapper.getCommentById(id);
        return comment;
    }
}
