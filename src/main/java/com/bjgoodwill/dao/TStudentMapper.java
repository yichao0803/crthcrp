package com.bjgoodwill.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.bjgoodwill.entity.TStudent;
import com.bjgoodwill.dao.base.TStudentBaseMapper;
/**
*  @author Zhangyichao
*/
public interface TStudentMapper extends TStudentBaseMapper{

    List<LinkedHashMap<String, Object>> superManagerSelect(String sql);
}