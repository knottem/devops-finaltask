package com.example.demo.controllers;

import com.example.demo.Calculator;
import com.example.demo.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    Calculator calculator = new Calculator();

    @GetMapping("/car")
    public Car getCar(){
        return new Car();
    }
    @GetMapping("/calculate/{number1}/{number2}/{operator}")
    public int getCalculate(@PathVariable int number1, @PathVariable int number2, @PathVariable String operator){
        return calculator.calculate(number1, number2, operator);
    }
}
