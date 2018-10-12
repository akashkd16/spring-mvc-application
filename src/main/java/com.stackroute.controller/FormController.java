package com.stackroute.controller;


import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FormController {

    @RequestMapping("/")
    public String registration() {

        return "loginForm";
    }


    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user, ModelMap model) {

        model.addAttribute("message", "User saved successfully.");
        return "success";
    }
}
