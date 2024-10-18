package com.example.demospringone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    /**
     * get,post,put,delete---增删改查
     * @return
     */
    @RequestMapping("/hello")
    public String hello () {
        return "hello world";
    }
}
