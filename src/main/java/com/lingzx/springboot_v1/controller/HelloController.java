package com.lingzx.springboot_v1.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @ClassName: HelloController
 * @Author: lingzx
 * @Date 2019/07/23 20:42:10
 * @Version 1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/sayHi/{name}")
    @ResponseBody
    public String sayHi(@PathVariable @Validated String name){
        return "Hello,"+name;
    }

}
