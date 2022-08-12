/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;


import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 *
 * @author gopik
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
      @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    /**
     * Test of dealCard method, of class GroupOfCards.
     */
    @Test
    public void testDealCardGood() {
        System.out.println("dealCard - Good");
        Player currPlayer = new Player("p1");
        GroupOfCards instance = new GroupOfCards();
        instance.dealCard(currPlayer);
        int count = 7;
        
        assertEquals(count, currPlayer.getHandCards().size());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testDealCardBoundary() {
        System.out.println("dealCard - Boundary");
        Player currPlayer = new Player("");
        GroupOfCards instance = new GroupOfCards();
        instance.dealCard(currPlayer);
        instance.addCard(currPlayer);
        int count =8;
        assertEquals(count, currPlayer.getHandCards().size());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testDealCardBad() {
        System.out.println("dealCard - Bad");
        Player currPlayer = new Player("P1");
        GroupOfCards instance = new GroupOfCards();
        //instance.dealCard(currPlayer);
        int count = 0;
        assertEquals(count, currPlayer.getHandCards().size());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class GroupOfCards.
     */
    @Test
    public void testAddCard_PlayerGood() {
        System.out.println("addCard - Good");
        Player currPlayer = new Player("p1");
        GroupOfCards instance = new GroupOfCards();
        instance.addCard(currPlayer);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
      int count =1;
      assertEquals(count, currPlayer.getHandCards().size());
    }
    
    @Test
    public void testAddCard_PlayerBoundary() {
        System.out.println("addCard - Boundary");
        Player currPlayer = new Player("p1");
        GroupOfCards instance = new GroupOfCards();
        //instance.addCard(currPlayer);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
      int count = 0;
        assertEquals(count, currPlayer.getHandCards().size());
    }

    @Test
    public void testAddCard_PlayerBad() {
        System.out.println("addCard - Bad");
        Player currPlayer = new Player("p1");
        GroupOfCards instance = new GroupOfCards();
        int count = 0;
        
        assertEquals(count, currPlayer.getHandCards().size());
    }
}
