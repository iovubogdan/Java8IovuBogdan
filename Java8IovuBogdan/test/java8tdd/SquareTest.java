/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bogdan
 */
public class SquareTest {
    
    public SquareTest() {
    }

    /**
     * Test of getDefinition method, of class Square.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Square instance = new Square();
        String expResult = "figura geometrica plana with four equal straight sides and four right angles.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
