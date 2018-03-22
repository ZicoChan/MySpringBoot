package com.springBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
public class HelloController {
    
    @ApiOperation(value="测试接口")
    @GetMapping("/hello/test")
    public String hello() {
        return "hello,this is a springboot demo";
    }
    
}
