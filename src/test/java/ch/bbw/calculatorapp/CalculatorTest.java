/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.calculatorapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 5im15nadhanapal
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of addition method, of class Calculator.
     */
    @Test
    public void testSummeZweiPositive() {
        System.out.println("addition");
        int summand1 = 2;
        int summand2 = 2;
        int result_2 = 4;
        Calculator instance = new Calculator();
        instance.addition(summand1, summand2, result_2);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result_2 == summand1+summand2)) {
        fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSummeZweiNegative() {
        System.out.println("addition");
        int summand1 = -2;
        int summand2 = -2;
        int result_2 = -4;
        Calculator instance = new Calculator();
        instance.addition(summand1, summand2, result_2);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result_2 == summand1+summand2)) {
        fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSummeZweiNull() {
        System.out.println("addition");
        int summand1 = 0;
        int summand2 = 0;
        int result_2 = 0;
        Calculator instance = new Calculator();
        instance.addition(summand1, summand2, result_2);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result_2 == summand1+summand2)) {
        fail("The test case is a prototype.");
        }
    }
}
