package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Link;
import com.sunqiao.myblog.mapper.LinkMapper;
import com.sunqiao.myblog.service.LinkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:21
 * @Since 2019
 */

@Service
public class LinkServiceImpl implements LinkService {


    @Resource
    LinkMapper linkMapper;

    public Link getLinkById(Integer id){
        Link link = linkMapper.getLinkById(id);
        return link;

    }
}
