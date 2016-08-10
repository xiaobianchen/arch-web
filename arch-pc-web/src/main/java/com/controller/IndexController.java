package com.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chenxiaobian on 16/7/1.
 */
@Controller
@Log4j
@RequestMapping("/")
public class IndexController {

    @Autowired
    private HttpServletRequest request;

    private final static String ASSETS = "assets";
    private final static String VENDOR = "vendor";
    private final static String APP = "app";
    private final static String INDEX = "index";
    private final static String INDEX_WEIXIN = "index-weixin";
    private final static String MENUS = "menus";

}