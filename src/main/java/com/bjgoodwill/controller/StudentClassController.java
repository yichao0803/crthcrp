package com.bjgoodwill.controller;

import com.bjgoodwill.entity.StudentClass;
import com.bjgoodwill.entity.StudentClassExample;
import com.bjgoodwill.service.IStudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;

import java.util.List;

@RestController
@RequestMapping(value="/api/StudentClass",produces = "application/json;charset=UTF-8")
public class StudentClassController extends  BaseController {

    @Autowired
    private IStudentClassService service;

    @GetMapping()
    public String  Get(){
        StudentClass studentClasss=service.selectByPrimaryKey(1);
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(studentClasss);

        return jsonResult;
    }
    @GetMapping(value="Page")
    public  String Page(){
        StudentClassExample example=new StudentClassExample();

        example.setLimit(10); // page size limit
        example.setOffset(0); // offset
        example.or().andClassidGreaterThanOrEqualTo(3);
        List<StudentClass> list = service.selectByExample(example);
        String jsonResult=com.alibaba.fastjson.JSON.toJSONString(this.FromObject(list,list.size(),0,""));
        return  jsonResult;
    }

    @GetMapping(value="login")
    public String Login(HttpSession session,String userName,String passWord){
        // 在session中保存用户身份信息
        session.setAttribute("username", userName);
        // 重定向到商品列表页面
        return "{username:"+userName+",passWord:"+passWord+"}";
    }

}
