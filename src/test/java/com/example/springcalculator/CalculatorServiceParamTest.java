package com.example.springcalculator;
import com.example.springcalculator.Service.CalculatorService;
import com.example.springcalculator.Service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParamTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("argsForSum")
    public void correctSum(int num1, int num2, int expected) {
        String sum = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected,sum);
    }

    private static Stream<Arguments> argsForSum() {
        return Stream.of(
                Arguments.of(2,3,5),
                Arguments.of(6,6,12),
                Arguments.of(3,7,10)
        );
    }
    @ParameterizedTest
    @MethodSource("argsForMinus")
    public void correctMinus(int num1, int num2, int expected) {
        String minus = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected,minus);
    }

    private static Stream<Arguments> argsForMinus() {
        return Stream.of(
                Arguments.of(5,10,-5),
                Arguments.of(6,4,2),
                Arguments.of(-10,-5,-5)
        );
    }@ParameterizedTest
    @MethodSource("argsForMultiply")
    public void correctMultiply(int num1, int num2, int expected) {
        String multiply = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected,multiply);
    }

    private static Stream<Arguments> argsForMultiply() {
        return Stream.of(
                Arguments.of(5,8,40),
                Arguments.of(3,6,18),
                Arguments.of(4,5,20)
        );
    }@ParameterizedTest
    @MethodSource("argsForDivide")
    public void correctDivide(int num1, int num2, int expected) {
        String divide = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected,divide);
    }
    private static Stream<Arguments> argsForDivide() {
        return Stream.of(
                Arguments.of(5,5,1),
                Arguments.of(10,5,2),
                Arguments.of(32,4,8)
        );
    }
}
