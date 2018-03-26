package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFormPage() {
        //System.out.println("in the loadform say Hi-1");
        return "formtemplate";
    }

    @RequestMapping("/processform")
    public String loadFormPage(@RequestParam("login") String login, Model model) {
        model.addAttribute("loginval", login);
        //System.out.println("in the loadform say Hi-2");
        return "confirm";
    }


    }