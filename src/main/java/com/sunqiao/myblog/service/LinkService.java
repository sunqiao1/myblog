package com.sunqiao.myblog.service;

import com.sunqiao.myblog.bean.Link;

import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:20
 * @Since 2019
 */
public interface LinkService {
    List<Map> getLink();

    int insertLink(String linkName, String linkUrl, String imgName, String describes, String contact, String contactWay);

    int updateLink(Integer id,String linkName, String linkUrl, String imgName, String describes, String contact, String contactWay);

    int deleteLink(Integer id);



}
