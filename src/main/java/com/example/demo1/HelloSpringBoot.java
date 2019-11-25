package com.example.demo1;/*
@author qichuang2pm
@date 2019/11/23 - 11:54
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @RequestMapping("/hello")
    public  String hello(){
        return  "Hello Spring Boot";
    }
}
