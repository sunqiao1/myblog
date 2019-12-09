package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Admin;
import com.sunqiao.myblog.service.AdminService;
import com.sunqiao.myblog.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.bind.ValidationEvent;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 14:27
 * @Since 2019
 * 通过路径为path
 *  正常为query
 *  如果是requestbody 选body
 *  如果是验证信息选择head比如token
 */
@Api(value = "博主信息",tags = "博主具体信息")
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    AdminService adminService;

    @GetMapping("/{id}")
    @ApiOperation(value = "查找用户",notes = "通过id查询用户")
    @ApiImplicitParam(name = "id",value = "用户id",dataType = "string",paramType = "path")

    public JsonResult getAdminById(@PathVariable("id") Integer id){
        Admin admin = adminService.getAdminById(id);
        return new JsonResult(admin);
    }

    @ApiOperation(value = "修改",notes = "修改用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "通过此id来对用户进行修改",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "userName",value = "用户名",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "password",value = "密码",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "sign",value = "签名",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "location",value = "地址",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "callself",value = "自称",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "nickName",value = "昵称",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "imageName",value = "头像",dataType = "string",paramType = "query")
    })
    @PutMapping("/updateadmin")
    public JsonResult updateAdmin(Integer id, String userName, String password, String sign, String location, String callself, String nickName, String imageName){
        int i = adminService.updateAdmin(id, userName, password, sign, location, callself, nickName, imageName);
        return new JsonResult(i);
    }


}
