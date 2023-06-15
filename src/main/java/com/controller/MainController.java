package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @RequestMapping("/home")
    public String home1(){
        return "home";
    }

}
