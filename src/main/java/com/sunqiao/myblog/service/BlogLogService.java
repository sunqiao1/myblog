package com.sunqiao.myblog.service;

import com.sunqiao.myblog.bean.BlogLog;

import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 11:54
 * @Since 2019
 */
public interface BlogLogService {

    List<Map> getBlogLogByLid();
    int insertBlogLog(String info);
    int updateBlogLog(Integer lid,String info);
    int deleteBlogLog(Integer lid);
}
