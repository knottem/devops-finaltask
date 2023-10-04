package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(5, c.calculate(2, 3, "add"));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(-1, c.calculate(2, 3, "subtract"));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals(6, c.calculate(2, 3, "multiply"));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        assertEquals(2, c.calculate(4, 2, "divide"));
    }

    @Test
    public void shouldReturnZeroForInvalidOperator() {
        assertEquals(0, c.calculate(2, 3, "modulus"));
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(ArithmeticException.class, () -> {
            c.calculate(4, 0, "divide");
        });
    }
    @Test
    public void shouldAddTwoNegativeNumbers() {
        assertEquals(-5, c.calculate(-2, -3, "add"));
    }

    @Test
    public void shouldSubtractNegativeFromPositiveNumber() {
        assertEquals(5, c.calculate(2, -3, "subtract"));
    }

    @Test
    public void shouldMultiplyNegativeNumbers() {
        assertEquals(6, c.calculate(-2, -3, "multiply"));
    }

    @Test
    public void shouldDivideNegativeByPositiveNumber() {
        assertEquals(-2, c.calculate(-4, 2, "divide"));
    }

    @Test
    public void shouldReturnZeroWhenAddingZero() {
        assertEquals(2, c.calculate(2, 0, "add"));
    }

    @Test
    public void shouldReturnZeroWhenMultiplyingByZero() {
        assertEquals(0, c.calculate(2, 0, "multiply"));
    }

    @Test
    public void shouldHandleLargeNumbers() {
        assertEquals(2000000000, c.calculate(1000000000, 1000000000, "add"));
    }

    @Test
    public void shouldReturnZeroForEmptyOperator() {
        assertEquals(0, c.calculate(2, 3, ""));
    }

    @Test
    public void shouldTotallyNotWork() {
        assertEquals(0, c.calculate(2, 3, "add"));
    }

}