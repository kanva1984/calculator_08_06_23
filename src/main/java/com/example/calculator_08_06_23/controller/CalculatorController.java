package com.example.calculator_08_06_23.controller;

import com.example.calculator_08_06_23.servise.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    public String sum(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "+" + num2 + "=" + calculatorService.sum(num1, num2);
    }
    @GetMapping("/minus")
    public String min(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "+" + num2 + "=" + calculatorService.min(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "*" + num2 + "=" + calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "/" + num2 + "=" + calculatorService.divide(num1, num2);
    }
}
