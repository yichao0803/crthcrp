package com.bjgoodwill.dao;

import com.bjgoodwill.entity.StudentClass;
import com.bjgoodwill.entity.StudentClassExample;

import java.util.LinkedHashMap;
import java.util.List;

public interface StudentClassMapper {
    int countByExample(StudentClassExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(StudentClass record);

    int insertSelective(StudentClass record);

    List<StudentClass> selectByExample(StudentClassExample example);

    StudentClass selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(StudentClass record);

    int updateByPrimaryKey(StudentClass record);

    List<LinkedHashMap<String, Object>> superManagerSelect(String sql);
}