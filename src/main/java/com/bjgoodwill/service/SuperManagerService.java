package com.bjgoodwill.service;

import com.bjgoodwill.dao.SuperManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class SuperManagerService implements ISuperManagerService {
    @Autowired
    private SuperManagerMapper mapper;

    @Override
    public List<LinkedHashMap<String, Object>> Select(String sql) {
        return  mapper.Select(sql);
    }
}
