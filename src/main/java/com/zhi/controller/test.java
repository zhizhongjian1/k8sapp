package com.zhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("/test")
    public String test(){
        return "hello kubernetes,I am zhi";
    }

    @RequestMapping("/test02")
    public String test02(){
        return "广州市品高软件股份有限公司";
    }

    @RequestMapping("/")
    public String test03(){
        return "北京时间2019/1/13 18:30";
    }

    @RequestMapping("/test04")
    public String test04() {
        return "北京時間2020/1/1410：55";
    }
}
