package com.sunqiao.myblog.mapper;

import com.sunqiao.myblog.bean.Link;

import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:18
 * @Since 2019
 */
public interface LinkMapper {
    List<Map> getLink();

    int insertLink(Link link);

    int updateLink(Link link);

    int deleteLink(Integer id);


}
