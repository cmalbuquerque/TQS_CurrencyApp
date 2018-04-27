/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqs.homework.currencyapi;

import java.util.HashMap;
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
        System.out.println("convert");
        double amount = 1.0;
        String from = "EUR";
        String to = "USD";
        ConvertResponse instance = new ConvertResponse();
        double expResult = 1.2131446650750208;
        double result = instance.convert(amount, from, to);
        assertEquals(expResult, result, 1.2131446650750208);
    }

    /**
     * Test of getList method, of class ConvertResponse.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        ConvertResponse instance = new ConvertResponse();
        HashMap<String, String> expResult = new HashMap<>();
        expResult.put("EUR", "EUR");
        expResult.put("USD", "USD");
        HashMap<String, String> result = instance.getList();
        assertEquals(expResult.containsKey(result), expResult.containsValue(result));
    }
    
}
