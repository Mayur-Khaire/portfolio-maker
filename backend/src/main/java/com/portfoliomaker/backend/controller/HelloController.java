package com.portfoliomaker.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Portfolio Maker Backend is Running 🚀";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Welcome to Portfolio Maker API 🚀";
    }
}