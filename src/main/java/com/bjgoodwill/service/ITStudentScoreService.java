package com.bjgoodwill.service;

import com.bjgoodwill.entity.TStudentScore;
import com.bjgoodwill.entity.TStudentScoreExample;
import java.util.List;


public interface ITStudentScoreService {
    int deleteByPrimaryKey(Integer id);

    int insert(TStudentScore record);

    int insertSelective(TStudentScore record);

    TStudentScore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TStudentScore record);

    int updateByPrimaryKey(TStudentScore record);

    List<TStudentScore> selectByExample(TStudentScoreExample example);
}
