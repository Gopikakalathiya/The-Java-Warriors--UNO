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
 * @author gopik
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
    @Test
    public void testValues() {
        System.out.println("values");
        CardColor[] expResult = null;
        CardColor[] result = CardColor.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class CardColor.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        CardColor expResult = null;
        CardColor result = CardColor.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndex method, of class CardColor.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex");
        CardColor instance = null;
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndex method, of class CardColor.
     */
    @Test
    public void testSetIndex() {
        System.out.println("setIndex");
        int index = 0;
        CardColor instance = null;
        instance.setIndex(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class CardColor.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CardColor instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class CardColor.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        CardColor instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CardColor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CardColor instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
