package com.hypertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/student")
    public String getHomePage(Model module){
        module.addAttribute("name","HyperTek");
        module.addAttribute("course","Spring MVC");
        return "students/welcome";
    }
}
