package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Link;
import com.sunqiao.myblog.service.LinkService;
import com.sunqiao.myblog.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:24
 * @Since 2019
 */
@Api(value = "友链",tags = "友链具体信息")
@RestController
@RequestMapping("/link")
public class LinkController {


    @Resource
    LinkService linkService;


    @ApiOperation(value = "查询",notes = "查询友链")
    @GetMapping("/select")
    public JsonResult getLink(){
        List<Map> link = linkService.getLink();

        return  new JsonResult(link);
    }


    @ApiOperation(value = "新增",notes = "新增友链")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "linkName",value = "友链昵称",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "linkUrl",value = "友链地址",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "imgName",value = "头像",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "describes",value = "描述",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "contact",value = "友链联系人",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "contactWay",value = "友链联系方式",dataType = "string",paramType = "query")
    })
    @PostMapping("/insert")
    public JsonResult insertLink(String linkName, String linkUrl, String imgName, String describes, String contact, String contactWay){
        int i = linkService.insertLink(linkName, linkUrl, imgName, describes, contact, contactWay);

        return  new JsonResult(i);
    }


    @ApiOperation(value = "修改",notes = "修改友链信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "通过此id来对用户进行修改",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "linkName",value = "友链昵称",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "linkUrl",value = "友链地址",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "imgName",value = "头像",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "describes",value = "描述",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "contact",value = "友链联系人",dataType = "string",paramType = "query"),
            @ApiImplicitParam(name = "contactWay",value = "友链联系方式",dataType = "string",paramType = "query")
    })
    @PutMapping("/update")
    public JsonResult updateLink(Integer id,String linkName, String linkUrl, String imgName, String describes, String contact, String contactWay){
        int i = linkService.updateLink(id,linkName,linkUrl,imgName,describes,contact,contactWay);

        return  new JsonResult(i);
    }


    @ApiOperation(value = "删除",notes = "通过id删除友链")
    @ApiImplicitParam(name = "id",value = "友链id",dataType = "string",paramType = "query")
    @DeleteMapping("/delete")
    public JsonResult deleteLink(Integer id){
        int i  = linkService.deleteLink(id);

        return  new JsonResult(i);
    }


}
