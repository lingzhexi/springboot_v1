package com.lingzx.springboot_v1.controller;

import com.lingzx.springboot_v1.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @ClassName: LucyController
 * @Author: lingzx
 * @Date 2019/07/23 21:25:52
 * @Version 1.0
 **/
@RestController
@RequestMapping("/lucy")
@EnableConfigurationProperties(ConfigBean.class)
public class LucyController {
//    @Autowired
//    ConfigBean configBean;
//
//    @RequestMapping(value = "/lucy")
//    public String miya() {
//        return configBean.getGreeting() + " >>>>" + configBean.getName() + " >>>>" + configBean.getUuid() + " >>>>" + configBean.getMax();
//    }
}
