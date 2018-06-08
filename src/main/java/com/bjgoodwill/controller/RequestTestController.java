package com.bjgoodwill.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/RequestTest",produces = "text/html;charset=UTF-8")
//@RequestMapping(value = "/api/RequestTest")
public class RequestTestController {
    @GetMapping()
    public String TestString(){
        return "this is a test string. Time:2017-10-29 20:42:00 张三";
    }
}
