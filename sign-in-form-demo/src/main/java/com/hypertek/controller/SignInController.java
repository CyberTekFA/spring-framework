package com.hypertek.controller;

import com.hypertek.model.SignInModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/signIn")
public class SignInController {
    @GetMapping("/index")
    public String getSignIn(Model model){
        List<String> stats = Arrays.asList(
                "VA","CA","MD","TX","NC","SC","WV"
        );
        model.addAttribute("signInModel",new SignInModel());
        model.addAttribute("listOfStats",stats);

        return "/index";
    }
    @PostMapping("/confirmation")
    public String postValues(@ModelAttribute("signInModel") SignInModel people, Model model){
        List<SignInModel> list = new ArrayList<>();
        list.add(people);
        model.addAttribute("people",list);

        return "/confirmation";
    }
}
