package com.example.demo.myController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mycontroller {

    @GetMapping("test")
    @ResponseBody
    public String testMetode(){

    }

}
