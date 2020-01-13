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
}
