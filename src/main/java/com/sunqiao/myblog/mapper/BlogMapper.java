package com.sunqiao.myblog.mapper;

import com.sunqiao.myblog.bean.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 19:10
 * @Since 2019
 */
public interface BlogMapper {
    //List<Map> getBlogByIdMapper(Integer id);

     List<Map> getBlogMapper();

     int insertBlog(Blog blog);

     Boolean updateBlog(Blog blog);

     int deleteBlog(Integer id);

}

