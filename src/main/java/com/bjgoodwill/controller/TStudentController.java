package com.bjgoodwill.controller;

import com.bjgoodwill.common.BaseController;
import com.bjgoodwill.entity.TStudent;
import com.bjgoodwill.service.ISuperManagerService;
import com.bjgoodwill.service.ITStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value="/api/TStudent",produces = "application/json;charset=UTF-8")
public class TStudentController extends BaseController {

    @Autowired
    private ITStudentService service;

    @Autowired
    private ISuperManagerService serviceSuper;

    @GetMapping()
    public String Get() {
        List<TStudent> students = service.queryTStudent(new TStudent());
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(students);
        return jsonResult;
    }

    @RequestMapping(value="superManagerSelect", method = RequestMethod.GET)
    @ResponseBody
    public String superManagerSelect(@RequestParam(required=true,value="sql")String sql) {
        try {
            List<LinkedHashMap<String, Object>> list= serviceSuper.Select("SELECT * FROM T_Student");
           return FromObjectToJson(list,list.size(),2,"test");
        } catch (Exception e) {
            return  FromBooleanToJson(false,99,e.toString());
            // LOGGER.error("Error method getPublicOptionItemList", e);
            // throw new ActivitiException("Error method getPublicOptionItemList", e);
        }

    }
}
