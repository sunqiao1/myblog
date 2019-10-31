package com.sunqiao.myblog.controller;

import com.sunqiao.myblog.bean.Link;
import com.sunqiao.myblog.service.LinkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:24
 * @Since 2019
 */
@Controller
public class LinkController {


    @Resource
    LinkService linkService;

    @GetMapping("/link/{id}")
    @ResponseBody()
    public Link getLinkById(@PathVariable("id") Integer  id){
        Link link = linkService.getLinkById(id);

        return  link;
    }

}
