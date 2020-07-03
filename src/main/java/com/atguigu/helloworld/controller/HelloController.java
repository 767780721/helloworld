package com.atguigu.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${server.port}") //在项目启动时，从配置文件中获取server.port key对应的属性值
    Integer port;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "hello , this  is :" + port +" port";
}

}
