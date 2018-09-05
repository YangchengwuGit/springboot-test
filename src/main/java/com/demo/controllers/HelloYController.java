package com.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloYController {

    @RequestMapping("/helloy")
    public String helloWorld () {
        return "Hello Ycw1!";
    }

}
