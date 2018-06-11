package com.bjgoodwill.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.bjgoodwill.entity.TStudent;
/**
*  @author Zhangyichao
*/
public interface TStudentBaseMapper {

    int insertTStudent(TStudent object);

    int updateTStudent(TStudent object);

    List<TStudent> queryTStudent(TStudent object);

    TStudent queryTStudentLimit1(TStudent object);
}