package com.sbsft.tms.controller;

import com.sbsft.tms.service.BaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    private final BaseService service;

    public BaseController(BaseService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String welcome(Model model){

        return "index";
    }

    @GetMapping("/dbtest")
    public String home(Model model){

        service.getTestKey(model);
        return "home";
    }
}
