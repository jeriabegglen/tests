/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeriabegglen
 */
public class TestsTest {
    
    public TestsTest() {
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
     * Test of add method, of class Tests.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "3";
        Tests instance = new Tests();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAdd2() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "3";
        Tests instance = new Tests();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test(expected=NumberFormatException.class)
    public void testAdd3() {
        System.out.println("add");
        String s1 = "test";
        String s2 = "3";
        Tests instance = new Tests();
        int expResult = 5;
        int result = instance.add(s1, s2);
        
    }
    
    /**
     * Test of subtract method, of class Tests.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        String s1 = "10";
        String s2 = "3";
        Tests instance = new Tests();
        int expResult = 7;
        int result = instance.subtract(s1, s2);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        String s1 = "3";
        String s2 = "10";
        Tests instance = new Tests();
        int expResult = -7;
        int result = instance.subtract(s1, s2);
        assertEquals(expResult, result);
        
    }
    
    @Test(expected=NumberFormatException.class)
    public void testSubtract3() {
        System.out.println("subtract");
        String s1 = "test";
        String s2 = "3";
        Tests instance = new Tests();
        int expResult = -7;
        int result = instance.subtract(s1, s2);
        
    }
    
    /**
     * Test of multiply method, of class Tests.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        String s1 = "4";
        String s2 = "2";
        Tests instance = new Tests();
        int expResult = 8;
        int result = instance.multiply(s1, s2);
        assertEquals(expResult, result);
       
    }

    @Test(expected=NumberFormatException.class)
    public void testMultiply2() {
        System.out.println("multiply");
        String s1 = "testing";
        String s2 = "2";
        Tests instance = new Tests();
        int expResult = 8;
        int result = instance.multiply(s1, s2);
       
    }
    
    /**
     * Test of divide method, of class Tests.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        String s1 = "6";
        String s2 = "3";
        Tests instance = new Tests();
        int expResult = 2;
        int result = instance.divide(s1, s2);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testDivide2() {
        System.out.println("divide");
        String s1 = "5";
        String s2 = "10";
        Tests instance = new Tests();
        int expResult = 1/2;
        int result = instance.divide(s1, s2);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testDivide3() {
        System.out.println("divide");
        String s1 = "0";
        String s2 = "2";
        Tests instance = new Tests();
        int expResult = 0;
        int result = instance.divide(s1, s2);
        assertEquals(expResult, result);
        
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDivide4() {
        System.out.println("divide");
        String s1 = "2";
        String s2 = "0";
        Tests instance = new Tests();
        int expResult = 0;
        int result = instance.divide(s1, s2);
        assertEquals(expResult, result);
        
    }
    
    @Test(expected=NumberFormatException.class)
    public void testDivide5() {
        System.out.println("divide");
        String s1 = "foo";
        String s2 = "5";
        Tests instance = new Tests();
        int expResult = 0;
        int result = instance.divide(s1, s2);
        assertEquals(expResult, result);
       
    }
    
}
