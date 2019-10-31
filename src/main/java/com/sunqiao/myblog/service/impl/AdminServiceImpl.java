package com.sunqiao.myblog.service.impl;

import com.sunqiao.myblog.bean.Admin;
import com.sunqiao.myblog.mapper.AdminMapper;
import com.sunqiao.myblog.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 14:23
 * @Since 2019
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminMapper adminMapper;


    @Transactional
    @Override
    public Admin getAdminById(Integer id) {
        Admin admin = adminMapper.getAdminById(id);

        return admin;
    }

    @Transactional
    @Override
    public int updateAdmin(Integer id, String userName, String password, String sign, String location, String callself, String nickName, String imageName) {
        Admin admin = new Admin(id,userName,password,sign,location,callself,nickName,imageName);
        int i = adminMapper.updateAdmin(admin);

        if(i != 1){
            System.out.println("修改用户信息失败");
        }


        return 1;
    }
}
