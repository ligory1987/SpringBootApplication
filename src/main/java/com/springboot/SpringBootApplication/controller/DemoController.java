package com.demo.springapplication.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {


    @GetMapping
    public String demo(){
        log.info("Some one accessed the endpoint");
        return "Hello Siva and Ramesh, How are you!";
    }
}
