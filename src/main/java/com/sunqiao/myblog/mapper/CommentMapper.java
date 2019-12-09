package com.sunqiao.myblog.mapper;

import com.sunqiao.myblog.bean.Comment;

import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 13:55
 * @Since 2019
 */
public interface CommentMapper {


    List<Map> getComment();

    int insertComment(Comment id);

    int deleteComment(Integer id);


}
