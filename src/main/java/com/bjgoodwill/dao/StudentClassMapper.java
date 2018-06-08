package com.bjgoodwill.dao;

import com.bjgoodwill.entity.StudentClass;

public interface StudentClassMapper {
    int deleteByPrimaryKey(Integer classid);

    int insert(StudentClass record);

    int insertSelective(StudentClass record);

    StudentClass selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(StudentClass record);

    int updateByPrimaryKey(StudentClass record);
}