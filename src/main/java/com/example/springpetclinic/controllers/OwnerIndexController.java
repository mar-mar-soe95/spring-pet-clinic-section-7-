package com.example.springpetclinic.controllers;

import com.example.springpetclinic.models.Owner;
import com.example.springpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/owners")
@Controller
public class OwnerIndexController {

    @Autowired
    private  OwnerService ownerService;

    @RequestMapping({"/index","/index.html"})
    public String getOwnerList(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }
    @RequestMapping({"/find", "/oups"})
    public String notImplement(){
        return "notimplemented";
    }
}
