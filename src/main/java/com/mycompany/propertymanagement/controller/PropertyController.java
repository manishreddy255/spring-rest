package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.dto.PropertyDto;
import com.mycompany.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;
    // autowired will implement the object related to the interface
    // and we can use it in our program

    // Restful api is just mapping the url to the method
    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("hai we are in hello route");
        return "Hello World";
    }
    @PostMapping("/properties")
    public PropertyDto saveProperty(@RequestBody PropertyDto propertyDto) {
        System.out.println("hai we are in saveProperty route");
        propertyService.saveProperty(propertyDto);
        System.out.println(propertyDto);
        return propertyDto;
    }
}
