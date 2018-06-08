package com.bjgoodwill.service;

import com.bjgoodwill.dao.StudentClassMapper;
import com.bjgoodwill.entity.StudentClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentClassService implements IStudentClassService {
    @Autowired
    private StudentClassMapper studentClassMapper;

    @Override
    public int deleteByPrimaryKey(Integer classid) {
        return studentClassMapper.deleteByPrimaryKey(classid);
    }

    @Override
    public int insert(StudentClass record) {
        return studentClassMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentClass record) {
        return studentClassMapper.insertSelective(record);
    }

    @Override
    public StudentClass selectByPrimaryKey(Integer classid) {
        return studentClassMapper.selectByPrimaryKey(classid);
    }

 //   @Override
//    public List<StudentClass> selectByCondition(StudentClass record) {
//        return studentClassMapper.selectByCondition(record);
//    }


    @Override
    public int updateByPrimaryKeySelective(StudentClass record) {
        return studentClassMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentClass record) {
        return studentClassMapper.updateByPrimaryKey(record);
    }
}
