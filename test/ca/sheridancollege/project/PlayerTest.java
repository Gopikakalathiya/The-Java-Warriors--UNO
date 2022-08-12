/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getHandCards method, of class Player.
     */
    @Test
    public void testGetHandCardsGood() {
        System.out.println("getHandCards - Good");
        Player p = new Player("P1");
        List<Card> expResult = new ArrayList<Card>();
        GroupOfCards g = new GroupOfCards();
        g.dealCard(p);
        int count = 7;
        assertEquals(count, p.getHandCards().size());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
      @Test
    public void testGetHandCardsBoundary() {
        System.out.println("getHandCards - Boundary");
        Player p = new Player("P1");
        List<Card> expResult = new ArrayList<Card>();
        GroupOfCards g = new GroupOfCards();
        g.dealCard(p);
        int count = 0;
        for(int i = 0 ; i< 7; i++){
            p.getHandCards().remove(0);
        }
        assertEquals(count, p.getHandCards().size());
    }
    
    
      @Test
    public void testGetHandCardsBad() {
        System.out.println("getHandCards - Bad");
        Player p = new Player("P1");
        List<Card> expResult = new ArrayList<Card>();
        GroupOfCards g = new GroupOfCards();
        int count = 0;
        assertEquals(count , p.getHandCards().size());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
}
