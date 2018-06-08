package com.bjgoodwill.service;

import com.bjgoodwill.entity.StudentClass;
import java.util.List;

public interface IStudentClassService {
    int deleteByPrimaryKey(Integer classid);

    int insert(StudentClass record);

    int insertSelective(StudentClass record);

    StudentClass selectByPrimaryKey(Integer classid);

    // List<StudentClass> selectByCondition(StudentClass record);

    int updateByPrimaryKeySelective(StudentClass record);

    int updateByPrimaryKey(StudentClass record);
}
