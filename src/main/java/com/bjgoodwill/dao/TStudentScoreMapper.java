package com.bjgoodwill.dao;

import com.bjgoodwill.entity.TStudentScore;
import com.bjgoodwill.entity.TStudentScoreExample;
import java.util.List;

public interface TStudentScoreMapper {
    int countByExample(TStudentScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStudentScore record);

    int insertSelective(TStudentScore record);

    List<TStudentScore> selectByExample(TStudentScoreExample example);

    TStudentScore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TStudentScore record);

    int updateByPrimaryKey(TStudentScore record);
}