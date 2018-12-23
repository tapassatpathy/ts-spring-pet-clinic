package com.tapas.basicSpring.spring5project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","/index","index.html","Index.html","Index",""})
    public String index(){
        return "index";
//        look for a template called index
    }

}
