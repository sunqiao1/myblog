package com.sunqiao.myblog.mapper;

import com.sunqiao.myblog.bean.Admin;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 18:40
 * @Since 2019
 */
public interface AdminMapper {
     Admin getAdminById(Integer id);

     int updateAdmin(Admin admin);



}
