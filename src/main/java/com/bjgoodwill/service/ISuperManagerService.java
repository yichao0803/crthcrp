package com.bjgoodwill.service;

import java.util.LinkedHashMap;
import java.util.List;

public interface ISuperManagerService {
    List<LinkedHashMap<String, Object>> Select(String sql);
}
