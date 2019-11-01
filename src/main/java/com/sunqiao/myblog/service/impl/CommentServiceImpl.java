package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Comment;
import com.sunqiao.myblog.mapper.CommentMapper;
import com.sunqiao.myblog.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Override
    public int deleteComment(Integer id) {
        int i = commentMapper.deleteComment(id);
        if(i!=1){
            System.out.println("删除评论失败");
        }

        return 1;
    }
}
