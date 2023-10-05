package com.example.demo;

public class Calculator {
    public int calculate(int number1, int number2, String operator) {
        int result = 0;
        switch (operator) {
            case "add":
                result = number1 + number2;
                break;
            case "subtract":
                result = number1 - number2;
                break;
            case "multiply":
                result = number1 * number2;
                break;
            case "divide":
                result = number1 / number2;
                break;
            default:
                break; // do nothing;
        }
        return result;
    }
}
