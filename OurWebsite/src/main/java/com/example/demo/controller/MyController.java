package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/aboutUs")
    public String aboutUs(){
        return "aboutUs";
    }

    @GetMapping("/navbar")
    public String navbar(){
        return "navbar";
    }

    @GetMapping("/matias")
    public String matias(){
        return "matias";
    }

    @GetMapping("/alexander")
    public String alexander(){
        return "alexander";
    }

    @GetMapping("/daniel")
    public String daniel(){
        return "daniel";
    }

}
