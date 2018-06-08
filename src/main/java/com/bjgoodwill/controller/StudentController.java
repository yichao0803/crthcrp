package com.bjgoodwill.controller;

import com.bjgoodwill.entity.Student;
import com.bjgoodwill.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/Student",produces = "application/json;charset=UTF-8")
public class StudentController {

    @Autowired
    private IStudentService service;

    @GetMapping()
    public String Get() {
        List<Student> students = service.selectByCondition(new Student());
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(students);
        // jsonResult="{\"name\":\"张三5\"}";
        return jsonResult;
    }
}
