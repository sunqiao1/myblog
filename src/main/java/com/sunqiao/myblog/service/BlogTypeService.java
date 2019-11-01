package com.sunqiao.myblog.service;

import com.sunqiao.myblog.bean.BlogType;

import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 20:17
 * @Since 2019
 */
public interface BlogTypeService {
   List<Map> getBlogTypeById();

   int insertBlogType(String typeName);

   int updateBlogType(Integer id,String typeName);

   int deleteBlogType(Integer id);
}
