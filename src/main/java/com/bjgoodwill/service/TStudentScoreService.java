package com.bjgoodwill.service;

import com.bjgoodwill.dao.TStudentScoreMapper;
import com.bjgoodwill.entity.TStudentScore;
import com.bjgoodwill.entity.TStudentScoreExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TStudentScoreService implements ITStudentScoreService {

    @Autowired
    private  TStudentScoreMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TStudentScore record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TStudentScore record) {
        return mapper.insertSelective(record);
    }

    @Override
    public TStudentScore selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TStudentScore record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TStudentScore record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TStudentScore> selectByExample(TStudentScoreExample example) {
        return mapper.selectByExample(example);
    }
}
