package com.example.springpetclinic.controllers;

import com.example.springpetclinic.models.Vet;
import com.example.springpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VetIndexController {

    @Autowired
    private VetService vetService;

    @RequestMapping({"vets/index", "vets/index.html", "/vets.html"})
    public String getVetIndexPage(Model model){

        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }

    @RequestMapping({"/find","/oups"})
    public String notImplement(){
        return "notimplemented";
    }
}
