package com.example.springpetclinic.controllers;

import com.example.springpetclinic.models.Owner;
import com.example.springpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OwnerIndexController {


    @RequestMapping("/owner")
    public String getOwnerList(Model model) {

        List<Owner> ownerList = new ArrayList();

        Owner owner1 = new Owner();
        owner1.setId(1l);
        owner1.setFirstName("Mar");
        owner1.setLastName("Zi");

        ownerList.add(owner1);

        model.addAttribute("owners", ownerList);
        return "owner/index";
    }
}
