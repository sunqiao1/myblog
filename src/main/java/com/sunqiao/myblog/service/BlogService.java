package com.sunqiao.myblog.service;

import com.sunqiao.myblog.bean.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 19:17
 * @Since 2019
 */
public interface BlogService {
    //public Blog getBlogByIdService(Integer id);
    List<Map> getBlogMapper();

    int insertBlog(String title,String content,String summary,String author,String imgName,String typeName);

    Boolean updateBlog(Integer id,String title,String summary, String imgName,String typeName,String content);

    int deleteBlog(Integer id);

}
