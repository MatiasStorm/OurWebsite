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

    @GetMapping("/harddisk")
    public String hardisk(){
        return "harddisk";
    }

    @GetMapping("/CPU")
    public String cpu(){
        return "CPU";
    }

    @GetMapping("/ram")
    public String ram(){
        return "ram";
    }

    @GetMapping("/gpu")
    public String gpu(){
        return "gpu";
    }

}
