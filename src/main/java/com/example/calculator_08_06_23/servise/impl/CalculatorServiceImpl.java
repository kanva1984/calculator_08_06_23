package com.example.calculator_08_06_23.servise.impl;

import com.example.calculator_08_06_23.servise.CalculatorService;
import org.springframework.stereotype.Service;

@Service

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer min(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Double divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return (double) num1 / num2;
    }
}
