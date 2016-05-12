package com.example.macbook.calculator;


public class Calculater {
    public double addplus(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;

    }

    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
    public double divide(double firstOperand, double secondOperand) {
        if(secondOperand ==0){
            throw new DivideByZeroException();

        }
        return firstOperand / secondOperand;
    }
}

