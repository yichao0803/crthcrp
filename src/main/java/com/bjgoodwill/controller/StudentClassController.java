package com.bjgoodwill.controller;

import com.bjgoodwill.common.BaseController;
import com.bjgoodwill.entity.StudentClass;
import com.bjgoodwill.entity.StudentClassExample;
import com.bjgoodwill.service.IStudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;

import java.util.List;

@RestController
@RequestMapping(value="/api/StudentClass")
//@RequestMapping(value="/api/StudentClass")
public class StudentClassController extends BaseController {

    @Autowired
    private IStudentClassService service;

    @GetMapping()
    public String  Get(){
        StudentClass studentClasss=service.selectByPrimaryKey(1);
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(studentClasss);

        return jsonResult;
    }
    @GetMapping(value="Page",produces = "application/json;charset=utf-8")
    public  String Page(){
        StudentClassExample example=new StudentClassExample();

        example.setLimit(9); // page size limit
        example.setOffset(0); // offset
        example.or().andClassidGreaterThanOrEqualTo(0);
        List<StudentClass> list = service.selectByExample(example);
        return  this.ToJson(this.FromObject(list,list.size(),0,""));
    }

    @GetMapping(value="login")
    public String Login(HttpSession session,String userName,String passWord){
        // 在session中保存用户身份信息
        session.setAttribute("username", userName);
        // 重定向到商品列表页面
        return "{username:"+userName+",passWord:"+passWord+"}";
    }

}
