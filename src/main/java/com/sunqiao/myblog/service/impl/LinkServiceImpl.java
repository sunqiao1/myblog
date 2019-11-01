package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Link;
import com.sunqiao.myblog.mapper.LinkMapper;
import com.sunqiao.myblog.service.LinkService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:21
 * @Since 2019
 */

@Service
public class LinkServiceImpl implements LinkService {


    @Resource
    LinkMapper linkMapper;

    @Transactional
    @Override
    public List<Map> getLink() {
        List<Map> link = linkMapper.getLink();

        return link;

    }

    @Transactional
    @Override
    public int insertLink(String linkName, String linkUrl, String imgName, String describes, String contact, String contactWay) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String addTime = sdf.format(now);

        Link link = new Link(linkName,linkUrl,imgName,describes,addTime,contact,contactWay);
        int i = linkMapper.insertLink(link);
        if (i != 1) {
            System.out.println("新增友链有误");
        }

        return 1;
    }

    @Transactional
    @Override
    public int updateLink(Integer id,String linkName, String linkUrl, String imgName, String describes, String contact, String contactWay) {
        Link link = new Link(id,linkName,linkUrl,imgName,describes,contact,contactWay);
        int i = linkMapper.updateLink(link);
        if (i != 1) {
            System.out.println("修改友链信息出错");
        }
        return 1;
    }



    @Transactional
    @Override
    public int deleteLink(Integer id) {
        int i = linkMapper.deleteLink(id);
        if (i != 1) {
            System.out.println("删除友链出错");
        }
        return 1;
    }
}
