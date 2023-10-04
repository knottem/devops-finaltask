package com.example.demo.controllers;

import com.example.demo.Calculator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    Calculator calculator = new Calculator();

    @GetMapping("/calculate/{number1}/{number2}/{operator}")
    public ResponseEntity<Integer> getCalculate(@PathVariable int number1, @PathVariable int number2, @PathVariable String operator){
        return ResponseEntity.ok(calculator.calculate(number1, number2, operator));
    }

}
