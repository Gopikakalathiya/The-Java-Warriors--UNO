/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class CardNoTest {
    
    public CardNoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    /**
     * Test of getIndex method, of class CardNo.
     */
    @Test
    public void testGetIndexGood() {
        System.out.println("getIndex");
        CardNo instance = null;
        instance.setIndex(0);
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGetIndexBad() {
        System.out.println("getIndex");
        CardNo instance = null;
        instance.setIndex(0001);
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGetIndexBoundary() {
        System.out.println("getIndex");
        CardNo instance = null;
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIndex method, of class CardNo.
     */
    

   
    @Test
    public void testGetNameGood() {
        System.out.println("getName");
        CardNo instance = null;
        instance.setName("Seven");
        String expResult = "Seven";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
 @Test
    public void testGetNameBad() {
        System.out.println("getName");
        CardNo instance = null;
        instance.setName("eihbjcednn c");
        String expResult = "Seven";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
     @Test
    public void testGetNameBoundary() {
        System.out.println("getName");
        CardNo instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
 
    
}
