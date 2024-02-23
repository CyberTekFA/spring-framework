package com.hypertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHome() {
        return "index.html";
    }
    @RequestMapping("/welcome")
    public String getWelcome(){
        return "welcome.html";
    }
}
