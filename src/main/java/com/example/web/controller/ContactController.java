package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    @GetMapping("/contact")
    public String showContactPage(){
        return "contact";
    }
}
