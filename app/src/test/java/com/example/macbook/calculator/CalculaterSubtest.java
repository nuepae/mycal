package com.example.macbook.calculator;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.validator.PublicClassValidator;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
@RunWith(Parameterized.class)

public class CalculaterSubtest{

    private  double fristOperand;
    private  double secondOperand;
    private  double expectedResult;

    public CalculaterSubtest(double fristOperand, double secondOperand, double expectedResult) {
        this.fristOperand = fristOperand;
        this.secondOperand = secondOperand;
        this.expectedResult = expectedResult;
    }

    @Test
    public void sub(){

        Calculater calculater = new Calculater();
        assertEquals(this.expectedResult,
                calculater.sub(this.fristOperand,this.secondOperand));


    }

    @Parameterized.Parameters
    public static List<Object[]>data(){
        return Arrays.asList(new Object[][]{
                {1,2,-1.0},
                {2,1,1}
        });

    }
}