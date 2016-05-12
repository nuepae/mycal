package com.example.macbook.calculator;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculaterTest {

    //Arrange
    Calculater calculater = new Calculater();
    @Test
    public  void หนึ่งบวกหนึ่งเท่ากับสอง(){

        //Act
        double actualResult = calculater.addplus(1,1);
        //Assert
        assertEquals(2.0, actualResult);

    }
    @Test
    public  void ลบ(){


        assertEquals(0.0, calculater.sub(1,1));
        assertEquals(1.0, calculater.sub(2,1));

    }


    @Test
    public  void  สองคูณหนึ่งเท่ากับสอง(){

        //Act
        double actualResult = calculater.mul(2,1);
        //Assert
        assertEquals(2.0, actualResult);

    }
    @Test
    public  void  สองหารหนึ่งเท่ากับสอง(){

        //Act
        double actualResult = calculater.divide(2,1);
        //Assert
        assertEquals(2.0, actualResult);

    }
    @Test(expected = DivideByZeroException.class)
    public  void  สองหารศูนย์จะเกิดข้อผิดพลาด_DivideByZeroException(){
        //Act
        calculater.divide(2,0);


    }
    /*
    @Test
    public  void  สองหารศูนย์จะเกิดข้อผิดพลาด2_DivideByZeroException(){
        //Act
        try {
            calculater.divide(2, 0);
            fail("บ้าละ");
        }catch (DivideByZeroException e){

        }


    }
*/

}
