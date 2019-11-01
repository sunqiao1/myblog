package com.sunqiao.myblog.service;

import com.sunqiao.myblog.bean.Comment;
import com.sunqiao.myblog.mapper.CommentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:01
 * @Since 2019
 */


public interface CommentService {
    List<Map> getComment();

    int deleteComment(Integer id);
}
