package com.kadioglumf.webapp.controller;

import com.kadioglumf.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    //add request login form
    @GetMapping("/loginForm")
    public String showMyLoginPage() {

        return "login-form";

    }
}
