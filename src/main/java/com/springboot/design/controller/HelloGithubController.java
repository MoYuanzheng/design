package com.springboot.design.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloGithubController {

    @GetMapping("/github")
    public String github(Model model){
        System.out.println("Hello Github!");
        model.addAttribute("msg","Hello Github!");
        return "github";
    }
}
