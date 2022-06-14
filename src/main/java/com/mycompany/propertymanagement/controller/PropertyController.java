package com.mycompany.propertymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/property")
public class PropertyController {

    // Restful api is just mapping the url to the method
    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("hai we are in hello route");
        return "Hello World";
    }
}
