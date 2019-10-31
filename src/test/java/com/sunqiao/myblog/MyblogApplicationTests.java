package com.sunqiao.myblog;

import com.sunqiao.myblog.bean.Blog;
import com.sunqiao.myblog.bean.BlogLog;
import com.sunqiao.myblog.bean.BlogType;
import com.sunqiao.myblog.mapper.BlogLogMapper;
import com.sunqiao.myblog.mapper.BlogMapper;
import com.sunqiao.myblog.mapper.BlogTypeMapper;
import com.sunqiao.myblog.service.BlogService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class MyblogApplicationTests {

    @Resource
    BlogMapper blogMapper;

    @Resource
    BlogService blogService;

    @Resource
    BlogTypeMapper blogTypeMapper;

    @Resource
    BlogLogMapper blogLogMapper;


    @Test
    void contextLoads() {
        Integer id = 1;
        //Blog blogByIdMapper = blogMapper.getBlogByIdMapper(id);
        //System.out.println(blogByIdMapper);
    }

    @Test
    public void testService(){
       // Blog blog = blogService.getBlogByIdService(1);
        //.out.println(blog);
    }

    @Test
    public void testMapper(){
        BlogType blogTypeByIdMapper = blogTypeMapper.getBlogTypeByIdMapper(1);
        System.out.println(blogTypeByIdMapper);
    }

    @Test
    public void testLog(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String releasedate = sdf.format(now);

        BlogLog blogLog = new BlogLog("saddassada",releasedate);

        int i = blogLogMapper.insertBlogLog(blogLog);
        System.out.println(i);
    }


}
