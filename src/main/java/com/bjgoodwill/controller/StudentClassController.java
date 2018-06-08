package com.bjgoodwill.controller;

import com.bjgoodwill.entity.StudentClass;
import com.bjgoodwill.service.IStudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/StudentClass",produces = "application/json;charset=UTF-8")
public class StudentClassController {

    @Autowired
    private IStudentClassService service;

    @GetMapping()
    public String  Get(){
        StudentClass studentClasss=service.selectByPrimaryKey(1);
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(studentClasss);
        return jsonResult;
    }

}
