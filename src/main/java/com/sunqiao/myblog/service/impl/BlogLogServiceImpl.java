package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Blog;
import com.sunqiao.myblog.bean.BlogLog;
import com.sunqiao.myblog.mapper.BlogLogMapper;
import com.sunqiao.myblog.service.BlogLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 11:56
 * @Since 2019
 */

@Service
public class BlogLogServiceImpl implements BlogLogService {
    @Resource
    BlogLogMapper blogLogMapper;


    @Transactional
    @Override
    public List<Map> getBlogLogByLid() {

        List<Map> list = blogLogMapper.getBlogLogByLid();

        return list;
    }

    @Transactional
    @Override
    public int insertBlogLog(String info) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String releasedate = sdf.format(now);

        BlogLog blogLog = new BlogLog(info,releasedate);
        int i = blogLogMapper.insertBlogLog(blogLog);
        if(i != 1){
            System.out.println("输入的日志有误");
        }

        return 1;
    }

    @Transactional
    @Override
    public int updateBlogLog(Integer lid, String info) {

        BlogLog blogLog = new BlogLog(lid,info);
        int i = blogLogMapper.updateBlogLog(blogLog);

        if(i != 1){
            System.out.println("修改的日志有误");
        }

        return 1;
    }

    @Transactional
    @Override
    public int deleteBlogLog(Integer lid) {
        int i = blogLogMapper.deleteBlogLog(lid);

        if(i != 1){
            System.out.println("删除日志失败");
        }
        return 1;
    }


}
