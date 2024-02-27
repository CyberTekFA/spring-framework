package com.hypertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    @RequestMapping("/info")
    public String getCar(@RequestParam String make , Model model){
        model.addAttribute("car",make);
        return "students/Car";
    }
    @RequestMapping("/car-info/{make}")
    public String getCarInfo(@PathVariable String make, Model model){
        model.addAttribute("car",make);
        return "students/Car";
    }
}
