package com.bjgoodwill.service;

import com.bjgoodwill.dao.TStudentMapper;
import com.bjgoodwill.entity.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TStudentService  implements ITStudentService {
    @Autowired
    private  TStudentMapper tStudentMapper;

    @Override
    public int insertTStudent(TStudent object) {
        return  tStudentMapper.insertTStudent(object);
    }

    @Override
    public int updateTStudent(TStudent object) {
        return  tStudentMapper.updateTStudent(object);
    }

    @Override
    public List<TStudent> queryTStudent(TStudent object) {
        return  tStudentMapper.queryTStudent(object);
    }

    @Override
    public TStudent queryTStudentLimit1(TStudent object) {
        return  tStudentMapper.queryTStudentLimit1(object);
    }
}

