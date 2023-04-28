/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class CheckTest {
    
    public CheckTest() {
    }

    /**
     * Test of checkString method, of class Check.
     */
    @Test
    public void testCheckString() {
        System.out.println("checkString");
        String myString = "sam!";
        Check instance = new Check();
        boolean expResult = true;
        boolean result = instance.checkString(myString);
        assertEquals(expResult, result);
 
        
    }

    /**
     * Test of sum method, of class Check.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 7;
        int b = 5;
        Check instance = new Check();
        int expResult = 12;
        int result = instance.sum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
