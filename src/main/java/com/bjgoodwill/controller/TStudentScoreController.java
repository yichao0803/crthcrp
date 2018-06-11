package com.bjgoodwill.controller;

import com.bjgoodwill.entity.TStudentScore;
import com.bjgoodwill.entity.TStudentScoreExample;
import com.bjgoodwill.service.ITStudentScoreService;
import com.bjgoodwill.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value="/api/TStudentScore")
public class TStudentScoreController extends BaseController {


    @Autowired
    private ITStudentScoreService service;

    @GetMapping()
    public String Get() {
        TStudentScoreExample example = new TStudentScoreExample();
        example.setLimit(10);
        example.setOffset(0);
        example.or().andIdGreaterThan(1);
        List<TStudentScore> list = service.selectByExample(example);
        return FromObjectToJson(list, list.size());
    }
}
