/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sonarittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dick
 */
public class CalculatorTest {
    


    /**
     * Test of add method, of class Calculator.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        int j = 3;
        int i = 4;
        Calculator instance = new Calculator();
        int expResult =7;
        int result = instance.add(j, i);
        assertEquals(expResult, result);
      
    }


    
}
