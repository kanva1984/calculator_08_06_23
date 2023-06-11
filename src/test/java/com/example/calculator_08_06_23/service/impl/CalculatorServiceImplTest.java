package com.example.calculator_08_06_23.service.impl;

import com.example.calculator_08_06_23.servise.CalculatorService;

import com.example.calculator_08_06_23.servise.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldCorrectlyCalculateSum1() {
        int num1 = 5;
        int num2 = 6;
        int expectedSum = num1 + num2;

        Integer actualSum = calculatorService.sum(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCorrectlyCalculateSum2() {
        int num1 = 30;
        int num2 = 0;
        int expectedSum = num1 + num2;

        Integer actualSum = calculatorService.sum(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCorrectlyCalculateMin1() {
        int num1 = 5;
        int num2 = 6;
        int expectedMin = num1 - num2;

        Integer actualMin = calculatorService.min(num1, num2);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void shouldCorrectlyCalculateMin2() {
        int num1 = 40;
        int num2 = 67;
        int expectedMin = num1 - num2;

        Integer actualMin = calculatorService.min(num1, num2);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void shouldCorrectlyCalculateMultiply1() {
        int num1 = 5;
        int num2 = 6;
        int expectedMultiply = num1 * num2;

        Integer actualMultiply = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedMultiply, actualMultiply);
    }

    @Test
    public void shouldCorrectlyCalculateMultiply2() {
        int num1 = 85;
        int num2 = 0;
        int expectedMultiply = num1 * num2;

        Integer actualMultiply = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedMultiply, actualMultiply);
    }
    @Test
    public void shouldCorrectlyCalculateDivide1() {
        int num1 = 85;
        int num2 = 6;
        double expectedDivide = (double) num1 / num2;

        Double actualDivide = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedDivide, actualDivide);
    }
    @Test
    public void shouldCorrectlyCalculateDivide2() {
        int num1 = 5;
        int num2 = 4;
        Double expectedSDivide = (double) num1 / num2;

        Double actualDivide = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedSDivide, actualDivide);
    }

    @Test
    public void shouldTrowExceptionWhenSecondNumIsZero() {
        int num1 = 40;
        int num2 = 0;

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.divide(num1, num2)
        );
    }

}
