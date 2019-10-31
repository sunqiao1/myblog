package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Blog;
import com.sunqiao.myblog.mapper.BlogMapper;
import com.sunqiao.myblog.service.BlogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 19:19
 * @Since 2019
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Resource
    BlogMapper blogMapper;


    @Override
    public List<Map> getBlogMapper() {
        List<Map> mapper = this.blogMapper.getBlogMapper();
        return mapper;
    }

    @Transactional
    @Override
    public int insertBlog(String title, String content, String summary, String author, String imgName, String typeName) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String subDate = sdf.format(now);

        Blog blog = new Blog(title, author, summary, imgName, content, typeName, subDate);

        int i = blogMapper.insertBlog(blog);
        if (i != 1) {
            System.out.println("输入文章有误");
        }

        return 1;

    }

    @Transactional
    @Override
    public Boolean updateBlog(Integer id, String title, String summary, String imgName, String typeName, String content) {

        Blog blog = new Blog(id, title, summary, imgName, content, typeName);
        Boolean flag = blogMapper.updateBlog(blog);

        if (flag == false) {
            System.out.println("修改文章失败");
        }

        return flag;
    }

    @Transactional
    @Override
    public int deleteBlog(Integer id) {
        int i = blogMapper.deleteBlog(id);
        if(i != 1){
            System.out.println("删除文章失败");

        }
        return 1;

    }


}
