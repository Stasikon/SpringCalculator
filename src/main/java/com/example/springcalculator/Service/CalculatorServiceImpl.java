package com.example.springcalculator.Service;


import com.example.springcalculator.Exception.NoneParamsException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String plus(Integer num1, Integer num2) {
        validateNumber(num1, num2);
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        validateNumber(num1, num2);
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        validateNumber(num1, num2);
        int result =num1*num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        validateNumber(num1,num2);
        if (num2 != 0) {
            int result = num1 / num2;
            return num1 + "/ " + num2 + " = " + result;
        }else {
            throw new NoneParamsException("На ноль делить нельзя");
        }
    }
    private void validateNumber(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Введите числа для вычисления");
        }
    }
}
