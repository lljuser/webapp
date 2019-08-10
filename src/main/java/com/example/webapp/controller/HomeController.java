package com.example.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "this is a webapp demo for test jenkins and spinnaker";
    }

    @GetMapping("/healthz")
    public String healthz(){
        return "ok";
    }
}
