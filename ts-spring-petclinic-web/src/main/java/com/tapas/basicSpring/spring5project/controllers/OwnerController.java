package com.tapas.basicSpring.spring5project.controllers;

import com.tapas.basicSpring.spring5project.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owner/index","Owner/Index","owner/Index","Owner/index","owner","Owner",
            "/owner/index.html","Owner/Index.html","owner/Index.html","Owner/index.html"})
    public String findOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }

}
