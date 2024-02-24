package com.hypertek.controller;

import com.hypertek.enums.Gender;
import com.hypertek.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {
    @RequestMapping("/mentor")
    public String getMentor(Model model){
        List<Mentor> mentors = new ArrayList<>();
        mentors.add(new Mentor("John","Smith",24, Gender.MALE));
        mentors.add(new Mentor("Mike","Deluca",33, Gender.MALE));
        mentors.add(new Mentor("Jason","Jonny",44, Gender.FEMALE));
        mentors.add(new Mentor("Fawad","Bahir",22, Gender.FEMALE));
       model.addAttribute("mentor",mentors);
       return "students/Mentor";
    }
}
