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
public class CardColorTest {
    
    public CardColorTest() {
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
     * Test of values method, of class CardColor.
     */
  
    /**
     * Test of getIndex method, of class CardColor.
     */
      @Test
    public void testGetIndexGood() {
        System.out.println("getIndex");
        CardColor instance = null;
        instance.setIndex(0);
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGetIndexBad() {
        System.out.println("getIndex");
        CardColor instance = null;
        instance.setIndex(1223123);
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGetIndexBoundary() {
        System.out.println("getIndex");
        CardColor instance = null;
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIndex method, of class CardColor.
     */
 

    /**
     * Test of getName method, of class CardColor.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("getName");
        CardColor instance = null;
        instance.setName("Blue");
        String expResult = "Blue";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGetNameBad() {
        System.out.println("getName");
        CardColor instance = null;
        instance.setName("fvfvfsvfv");
        String expResult = "Blue";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGetNameBoundary() {
        System.out.println("getName");
        CardColor instance = null;
        String expResult = "Blue";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class CardColor.
     */
    

    /**
     * Test of toString method, of class CardColor.
     */
    
    
}
