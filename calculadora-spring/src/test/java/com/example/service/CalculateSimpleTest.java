/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.OperationModel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhamil
 * repositorio con el proyecto completo
 * https://github.com/JhamileX/COM470
 */
public class CalculateSimpleTest {
    
    CalculateSimple calc = new CalculateSimple();
    public CalculateSimpleTest() {
    }

    @Test
    public void testAdd() {
        OperationModel operationModel = new OperationModel(5, 4);
        int expResult = 9;
        int result = calc.add(operationModel);
        assertEquals(expResult, result);
    }
    @Test
    public void testSubstract() {
        OperationModel operationModel = new OperationModel(3, 4);
        int expResult = -1;
        int result = calc.subtract(operationModel);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMultiply() {
        OperationModel operationModel = new OperationModel(3, 6);
        int expResult = 18;
        int result = calc.multiply(operationModel);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivide() {
        OperationModel operationModel = new OperationModel(6, 2);
        double expResult = 3;
        double result = (double)calc.divide(operationModel);
        assertEquals(expResult, result,0.1);
    }
    
    @Test
    public void testFactorial() {
        OperationModel operationModel = new OperationModel(4);
        int expResult = 24;
        int result = calc.factorial(operationModel);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFibonacci() {
        OperationModel operationModel = new OperationModel(8);
        int expResult = 21;
        int result = calc.fibonacci(operationModel);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSqrt() {
        OperationModel operationModel = new OperationModel(25);
        double expResult = 5;
        double result = calc.sqrt(operationModel);
        assertEquals(expResult, result,0.1);
    }
    
    @Test
    public void testPower() {
        OperationModel operationModel = new OperationModel(6);
        int expResult = 36;
        int result = calc.power(operationModel);
        assertEquals(expResult, result);
    }
}
