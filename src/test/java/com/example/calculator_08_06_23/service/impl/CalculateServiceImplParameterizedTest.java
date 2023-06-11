package com.example.calculator_08_06_23.service.impl;

import com.example.calculator_08_06_23.servise.CalculatorService;
import com.example.calculator_08_06_23.servise.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculateServiceImplParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> argumentForCalculate() {
        return Stream.of(
                Arguments.of(5,5),
                Arguments.of(100,-30),
                Arguments.of(0,6),
                Arguments.of(7,100)
                );
    }

    @ParameterizedTest
    @MethodSource( "argumentForCalculate")
    public void shouldCorrectlyCalculateSum(int num1, int num2) {
        int expectedSum = num1 + num2;


        Integer actualSum = calculatorService.sum(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @ParameterizedTest
    @MethodSource( "argumentForCalculate")

    public void shouldCorrectlyCalculateMin(int num1, int num2) {

        int expectedMin = num1 - num2;

        Integer actualMin = calculatorService.min(num1, num2);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @ParameterizedTest
    @MethodSource( "argumentForCalculate")
    public void shouldCorrectlyCalculateMultiply(int num1, int num2) {

        int expectedMultiply = num1 * num2;

        Integer actualMultiply = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedMultiply, actualMultiply);
    }

    @ParameterizedTest
    @MethodSource( "argumentForCalculate")
    public void shouldCorrectlyCalculateDivide(int num1, int num2) {

        double expectedDivide = (double) num1 / num2;

        Double actualDivide = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedDivide, actualDivide);
    }

}
