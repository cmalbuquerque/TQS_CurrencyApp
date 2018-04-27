/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqs.homework.currencyapi;

import java.util.HashMap;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carolina albuquerque
 */
public class ConvertResponseTest {
    
    public ConvertResponseTest() {
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
     * Test of convert method, of class ConvertResponse.
     */
    @Test
    public void testConvert() {
        System.out.println("Convert Test");
        double amount = 1.0;
        String from = "EUR";
        String to = "USD";
        ConvertResponse instance = new ConvertResponse();
        double expResult = 1.2113811683529092;
        double result = instance.convert(amount, from, to);
        assertEquals(expResult, result, 1.2113811683529092);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

