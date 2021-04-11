/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD3_Pract3_JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salga
 */
public class ListaBisiestosIT {
    
    public ListaBisiestosIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of esBisiesto method, of class ListaBisiestos.
     */
    @Test
    public void testEsBisiesto() {
        System.out.println("esBisiesto");
        Integer year = 1921;
        ListaBisiestos instance = new ListaBisiestos();
        boolean expResult = false;
        boolean result = instance.esBisiesto(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addYear method, of class ListaBisiestos.
     */
    @Test
    public void testAddYear() {
        System.out.println("addYear");
        Integer year = 1921;
        ListaBisiestos instance = new ListaBisiestos();
        instance.addYear(year);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
