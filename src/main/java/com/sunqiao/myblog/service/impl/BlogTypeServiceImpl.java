package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.BlogType;
import com.sunqiao.myblog.mapper.BlogTypeMapper;
import com.sunqiao.myblog.service.BlogTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 20:19
 * @Since 2019
 */
@Service
public class BlogTypeServiceImpl implements BlogTypeService {

    @Resource
    BlogTypeMapper blogTypeMapper;


    @Transactional
    @Override
    public List<Map> getBlogTypeById() {
        List<Map> list = blogTypeMapper.getBlogTypeById();
        return list;
    }

    @Override
    public int insertBlogType(String typeName) {
        BlogType blogType = new BlogType(typeName);
        int i = blogTypeMapper.insertBlogType(blogType);

        if(i !=1){
            System.out.println("新增博文类型有误");

        }

        return 1;
    }


    @Transactional
    @Override
    public int updateBlogType(Integer id, String typeName) {
        BlogType blogType = new BlogType(id,typeName);
        int i = blogTypeMapper.updateBlogType(blogType);
        if(i!=1){
            System.out.println("修改博文类型有误");
        }
        return 1;
    }

    @Transactional
    @Override
    public int deleteBlogType(Integer id) {
        int i = blogTypeMapper.deleteBlogType(id);

        if(i!=1){
            System.out.println("删除博文类型有误");
        }
        return 1;
    }
}
