package com.mycompany.propertymanagement.controller;


import com.mycompany.propertymanagement.dto.CalculatorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator") // class level mapping of url to controller class
public class CalculatorController {

    // this is method level mapping of url to method
    @GetMapping("/add")
    public Double add(@RequestParam("num1") Double a,@RequestParam("num2") Double b) {
        return a + b;
    }

    @GetMapping("/subtract/{num1}/{num2}") // map the values of the url to java variables by path variable method
    public Double subtract(@PathVariable("num1") Double num1,@PathVariable("num2") Double num2) {
        Double res = null;

        if(num1 > num2) {
            res = num1 - num2;
        } else {
            res = num2 - num1;
        }
        return res;
    }

    @PostMapping("/multiply") // map the values of the url to java variables by path variable method
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDto calculatorDto) {
        Double result = null;
        result = calculatorDto.getNum1() * calculatorDto.getNum2() * calculatorDto.getNum3() * calculatorDto.getNum4();
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);
        return responseEntity;
    }

}
