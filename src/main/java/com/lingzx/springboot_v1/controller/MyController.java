package com.lingzx.springboot_v1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @ClassName: MyControlle
 * @Author: lingzx
 * @Date 2019/07/23 21:08:04
 * @Version 1.0
 **/
@RestController
public class MyController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/miya")
    public String miya(){
        return name +":" +age ;
    }

}
