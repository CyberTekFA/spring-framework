package com.hypertek.controller;

import com.hypertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/student")
    public String getHomePage(Model module){
        module.addAttribute("name","HyperTek");
        module.addAttribute("course","Spring MVC");
        int random = (int) Math.floor(new Random().nextInt());
        List<Integer> ran = new ArrayList<>();
        ran.add(random);
        module.addAttribute("id", ran);
        Student student = new Student(1,"Mike","John");
        module.addAttribute("student",student);
        return "students/welcome";
    }
}
