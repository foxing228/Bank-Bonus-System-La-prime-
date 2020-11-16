package com.fit.laprime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContoller {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String homepage() {
        return "main";
    }
}
