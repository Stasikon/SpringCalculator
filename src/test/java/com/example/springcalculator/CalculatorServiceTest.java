package com.example.springcalculator;

import com.example.springcalculator.Service.CalculatorService;
import com.example.springcalculator.Service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void sum2and3() {
        String plus = calculatorService.plus(2, 3);
        Assertions.assertEquals(5, plus);
    }
    @Test
    public void minus5and10() {
        String diff = calculatorService.minus(5, 10);
        Assertions.assertEquals(-5, diff);
    }

    @Test
    public void multiply5and8() {
        String multiply = calculatorService.multiply(5, 8);
        Assertions.assertEquals(40, multiply);
    }

    @Test
    public void divide8and8() {
        String divide = calculatorService.divide(8, 8);
        Assertions.assertEquals(1, divide);
    }

    @Test
    public void IllegalArgumentException() {
        Assertions.assertThrows(IllegalAccessException.class, () -> calculatorService.divide(5, 0));
    }

}
