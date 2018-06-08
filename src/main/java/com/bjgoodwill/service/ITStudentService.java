package com.bjgoodwill.service;

import com.bjgoodwill.entity.TStudent;

import java.util.List;

public interface ITStudentService {

    int insertTStudent(TStudent object);

    int updateTStudent(TStudent object);

    List<TStudent> queryTStudent(TStudent object);

    TStudent queryTStudentLimit1(TStudent object);
}
