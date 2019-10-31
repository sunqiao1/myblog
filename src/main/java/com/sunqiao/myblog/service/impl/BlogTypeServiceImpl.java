package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.BlogType;
import com.sunqiao.myblog.mapper.BlogTypeMapper;
import com.sunqiao.myblog.service.BlogTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 20:19
 * @Since 2019
 */
@Service
public class BlogTypeServiceImpl implements BlogTypeService {

    @Resource
    BlogTypeMapper blogTypeMapper;


    @Override
    public BlogType getBlogTypeByIdService(Integer id) {
        BlogType blogType = blogTypeMapper.getBlogTypeByIdMapper(id);

        return blogType;
    }
}
