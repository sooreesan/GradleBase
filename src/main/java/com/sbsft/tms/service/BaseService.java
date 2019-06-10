package com.sbsft.tms.service;

import com.sbsft.tms.mapper.BaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BaseService {

    private final BaseMapper mapper;


    public BaseService(BaseMapper mapper) {
        this.mapper = mapper;
    }

    public void getTestKey(Model model) {
        model.addAttribute("testkey",mapper.getTestKey());
    }
}

