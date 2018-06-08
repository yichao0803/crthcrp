package com.bjgoodwill.controller;

import com.bjgoodwill.entity.TStudent;
import com.bjgoodwill.service.ITStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/TStudent",produces = "application/json;charset=UTF-8")
public class TStudentController {

    @Autowired
    private ITStudentService service;

    @GetMapping()
    public String Get() {
        List<TStudent> students = service.queryTStudent(new TStudent());
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(students);
        // jsonResult="{\"name\":\"张三5\"}";
        return jsonResult;
    }
}
