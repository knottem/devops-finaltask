package com.example.demo.controllers;

import com.example.demo.Calculator;
import com.example.demo.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/car")
    public Car getCar(){
        return new Car();
    }

}
