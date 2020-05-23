package com.example.springpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        return "index";
    }
}
