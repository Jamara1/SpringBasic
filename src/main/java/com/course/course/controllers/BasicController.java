package com.course.course.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class BasicController {

    @GetMapping(path = {"/greet", "/helloworld"})
    public String greet() {
        return "index";
    }
}
