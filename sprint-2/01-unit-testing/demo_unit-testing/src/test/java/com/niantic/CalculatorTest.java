package com.niantic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
//should almost read like a sentence, should match what we are testing
    //wanna test individual scenarios one at a time


    @Test
    public void add_shouldReturn_sumOfNumbers() {
        //three sections in test

        //arrange//pre-Conditions//googledoc
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 3;
        double expected = 13;


        //act//input
        double actual = calculator.add(firstNumber,secondNumber);


        //assert//return//get

        //most common assertion
        //Assertions.
        assertEquals(expected, actual, "Because it should have added 10 + 3");



    }

    //what some tests might look like
   // @Test
   // public void add()
    //{
     //   Calculator calculator = new Calculator();
      //  assertEquals(expected, calculator.add);
   // }

    //method name up front gets them all together alphabetical


}