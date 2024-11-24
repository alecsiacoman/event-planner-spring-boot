package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DreamController {
    @GetMapping("/")
    public String showHomePage(){
        return "home";
    }
}