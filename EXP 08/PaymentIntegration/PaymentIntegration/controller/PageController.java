package com.example.PaymentIntegration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "checkout";
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    @GetMapping("/cancel")
    public String cancel() {
        return "cancel";
    }
}