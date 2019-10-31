package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Admin;
import com.sunqiao.myblog.service.AdminService;
import com.sunqiao.myblog.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 14:27
 * @Since 2019
 */
@Controller
public class AdminController {

    @Resource
    AdminService adminService;

    @GetMapping("/admin/{id}")
    @ResponseBody
    public JsonResult getAdminById(@PathVariable("id") Integer id){
        Admin admin = adminService.getAdminById(id);
        return new JsonResult(admin);
    }

    @GetMapping("/admin/updateadmin")
    @ResponseBody
    public JsonResult updateAdmin(Integer id, String userName, String password, String sign, String location, String callself, String nickName, String imageName){
        int i = adminService.updateAdmin(id, userName, password, sign, location, callself, nickName, imageName);
        return new JsonResult(i);
    }


}
