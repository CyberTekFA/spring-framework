package com.hypertek.controller;

import com.hypertek.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @RequestMapping("/student")
    public String getStudents(Model model){
        model.addAttribute("student", DataGenerator.createStudent());
        return "students/student";
    }
}
