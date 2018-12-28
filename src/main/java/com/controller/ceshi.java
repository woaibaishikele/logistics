package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ceshi {

    @RequestMapping("/index")
    public String kok(){
        return "index";
    }

    public  String da(){
        return "";
    }
}
