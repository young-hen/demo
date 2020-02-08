package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("/hello")
    public String hello(){


        System.out.println("new2");
        return "hello";
    }


}
