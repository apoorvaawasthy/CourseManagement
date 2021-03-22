package com.springrest.springselect.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/Home")
    public String home(){
        return "Welcome to courses application!";
    }
}