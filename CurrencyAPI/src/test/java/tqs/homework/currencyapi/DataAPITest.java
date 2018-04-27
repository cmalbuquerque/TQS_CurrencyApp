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
 * @author carolina
 */
public class DataAPITest {
    
    public DataAPITest() {
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
     * Test of getData method, of class DataAPI.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        DataAPI instance = new DataAPI();
        HashMap<String, Double> expResult = new HashMap<>();
        expResult.put("EUR", 0.824304);
        expResult.put("USD", 1.0);
        HashMap<String, Double> result = instance.getData();
        assertEquals(expResult.containsKey(result), expResult.containsValue(result));
    }
    
}
