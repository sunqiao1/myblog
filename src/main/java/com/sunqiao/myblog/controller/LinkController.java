package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Link;
import com.sunqiao.myblog.service.LinkService;
import com.sunqiao.myblog.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:24
 * @Since 2019
 */
@Controller
public class LinkController {


    @Resource
    LinkService linkService;

    @GetMapping("/link/select")
    @ResponseBody()
    public JsonResult getLink(){
        List<Map> link = linkService.getLink();

        return  new JsonResult(link);
    }

    @GetMapping("/link/insert")
    @ResponseBody()
    public JsonResult insertLink(String linkName, String linkUrl, String imgName, String describes, String contact, String contactWay){
        int i = linkService.insertLink(linkName, linkUrl, imgName, describes, contact, contactWay);

        return  new JsonResult(i);
    }

    @GetMapping("/link/update")
    @ResponseBody()
    public JsonResult updateLink(Integer id,String linkName, String linkUrl, String imgName, String describes, String contact, String contactWay){
        int i = linkService.updateLink(id,linkName,linkUrl,imgName,describes,contact,contactWay);

        return  new JsonResult(i);
    }

    @GetMapping("/link/delete")
    @ResponseBody()
    public JsonResult deleteLink(Integer id){
        int i  = linkService.deleteLink(id);

        return  new JsonResult(i);
    }


}
