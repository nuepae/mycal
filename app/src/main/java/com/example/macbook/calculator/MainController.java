package com.example.macbook.calculator;


public class MainController {

    Calculater calculater = new Calculater();
    CalculaterListener listener;

    public void setListener(CalculaterListener listener){

        this.listener = listener;

    }

    public void add(double firstOperand , double secondOperand){

        listener.onSuccess(String.valueOf(calculater.addplus(firstOperand,secondOperand)));

    }

    public void sub(double firstOperand , double secondOperand){

        listener.onSuccess(String.valueOf(calculater.sub(firstOperand,secondOperand)));

    }

    public void mul(double firstOperand , double secondOperand){

        listener.onSuccess(String.valueOf(calculater.mul(firstOperand,secondOperand)));

    }

    public void divide(double firstOperand , double secondOperand){

        listener.onSuccess(String.valueOf(calculater.divide(firstOperand,secondOperand)));

    }
}
