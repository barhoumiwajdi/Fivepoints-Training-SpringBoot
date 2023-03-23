package com.example.jpatraining.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/")
public class home {
    @GetMapping
    public String home(){
        return "serving on back end Spring Boot " + new Date();
    }
}
