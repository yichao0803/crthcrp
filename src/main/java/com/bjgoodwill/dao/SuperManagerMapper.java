package com.bjgoodwill.dao;

import java.util.LinkedHashMap;
import java.util.List;

public interface SuperManagerMapper {
    List<LinkedHashMap<String, Object>> Select(String sql);
}

