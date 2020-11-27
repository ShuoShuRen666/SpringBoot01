package com.atguigu.controller;

import com.atguigu.properties.DataSourcesProperties;
import com.atguigu.properties.DataSourcesProperties2;
import com.atguigu.properties.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  //@RestController  ==   @Controller + @ResponseBody
//@EnableConfigurationProperties(DataSourcesProperties2.class)
public class HelloController {

   // @Autowired
    //DataSourcesProperties2 dataSourcesProperties2;

    @Autowired
    JdbcProperties jdbcProperties;

    //@ResponseBody
    @RequestMapping("/hello")
    public String sayHello(){
        //System.out.println("dataSourcesProperties = " + dataSourcesProperties2);
        return "hello springBoot!!";
    }

    @RequestMapping("/hello2")
    public String sayHello2(){
        System.out.println("jdbcProperties = " + jdbcProperties);
        return "对象属性注入";
    }
}
