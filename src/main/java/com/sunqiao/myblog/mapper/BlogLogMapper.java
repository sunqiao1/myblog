package com.sunqiao.myblog.mapper;

import com.sunqiao.myblog.bean.BlogLog;

import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 11:50
 * @Since 2019
 */
public interface BlogLogMapper {

    List<Map> getBlogLogByLid();

    int insertBlogLog(BlogLog blogLog);

    int updateBlogLog(BlogLog blogLog);

    int deleteBlogLog(Integer lid);

}
