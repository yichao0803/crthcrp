package com.bjgoodwill.controller;

import com.bjgoodwill.entity.TStudentScore;
import com.bjgoodwill.entity.TStudentScoreExample;
import com.bjgoodwill.service.ISuperManagerService;
import com.bjgoodwill.service.ITStudentScoreService;
import com.bjgoodwill.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping(value="/api/TStudentScore")
public class TStudentScoreController extends BaseController {

    @Autowired
    private ITStudentScoreService service;

    @Autowired
    private ISuperManagerService serviceSuper;

    @GetMapping()
    public String Get() {
        TStudentScoreExample example = new TStudentScoreExample();
        example.setLimit(10);
        example.setOffset(0);
        example.or().andIdGreaterThan(1);
        List<TStudentScore> list = service.selectByExample(example);
        return FromObjectToJson(list, list.size());
    }

    @GetMapping(value="login")
    public String Login(HttpSession session, String userName, String passWord){
        // 在session中保存用户身份信息
        session.setAttribute("username", userName);
        // 重定向到商品列表页面
        return "{username:"+userName+",passWord:"+passWord+"}";
    }

    @RequestMapping(value="superManagerSelect", method = RequestMethod.GET)
    @ResponseBody
    public String superManagerSelect(@RequestParam(required=true,value="sql")String sql) {
        try {
            List<LinkedHashMap<String, Object>> list= serviceSuper.Select("SELECT * FROM T_Student");
            return FromObjectToJson(list,list.size(),2,"test");
        } catch (Exception e) {
            return  FromBooleanToJson(false,99,e.toString());
        }
    }
}
