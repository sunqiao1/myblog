package com.sunqiao.myblog.service;

import com.sunqiao.myblog.bean.Admin;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 14:21
 * @Since 2019
 */
public interface AdminService {
    Admin getAdminById(Integer id);

    int updateAdmin(Integer id, String userName, String password, String sign, String location, String callself, String nickName, String imageName);

}
