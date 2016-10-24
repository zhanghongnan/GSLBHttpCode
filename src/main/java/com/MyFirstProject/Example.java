package com.MyFirstProject;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张宏南 on 2016-10-24.
 * Project GSLBHttpCode
 * Package com.MyFirstProject
 */
@RestController
@EnableAutoConfiguration
public class Example extends BaseController {
    @RequestMapping("/")
    String home(){
        return "hello world";
    }

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName){
        return "Hello"+myName+"!!!";
    }
    @RequestMapping("/api")
    String code(){
        return "{ \"code\": 200, \"message\": \"测试成功\"}";
    }
    @RequestMapping("restDemo.do")
    public String restDemo(){
        response.setHeader("Content-Type", "application/json");
        //content-type为application/x-json;charset=UTF-8
        response.setStatus(560);
        return "{\"code\":\"560\",\"detail\":\"出现异常\"}";
    }
}
