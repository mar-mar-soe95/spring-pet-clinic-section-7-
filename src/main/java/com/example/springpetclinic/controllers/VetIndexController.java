package com.example.springpetclinic.controllers;

import com.example.springpetclinic.models.Vet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VetIndexController {

    @RequestMapping("/vet")
    public String getVetIndexPage(Model model){

        Vet vet = new Vet();
        vet.setId(1l);
        vet.setFirstName("Zi");
        vet.setLastName("Sar");
        List<Vet> vetList = new ArrayList<Vet>();
        vetList.add(vet);
        model.addAttribute("vets",vetList);
        return "vets/index";
    }
}
