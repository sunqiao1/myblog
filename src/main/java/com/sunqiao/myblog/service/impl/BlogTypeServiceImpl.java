package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.BlogType;
import com.sunqiao.myblog.mapper.BlogTypeMapper;
import com.sunqiao.myblog.service.BlogTypeService;
import org.springframework.stereotype.Service;

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


    @Override
    public List<Map> getBlogTypeById() {
        List<Map> list = blogTypeMapper.getBlogTypeById();
        return list;
    }
}
