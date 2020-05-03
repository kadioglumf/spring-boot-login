package com.kadioglumf.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // homepage
    @GetMapping("/")
    public String showHome() {

        return "home";
    }

    // add request mapping for /systems
    @GetMapping("/systems")
    public String showSystems() {

        return "admin-form";
    }

}