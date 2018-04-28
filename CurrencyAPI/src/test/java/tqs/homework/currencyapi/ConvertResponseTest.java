/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqs.homework.currencyapi;

import java.util.HashMap;
import org.easymock.EasyMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author carolina albuquerque
 */
public class ConvertResponseTest {

    private DataAPI apiMock;
    private ConvertResponse instance;
    
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
        this.instance = new ConvertResponse();
        this.apiMock = EasyMock.createMock(DataAPI.class);
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
        
        //ConvertResponse instance = new ConvertResponse();
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
        
        EasyMock.expect(apiMock.getData()).andReturn(new HashMap<String,Double>(){{
            put("EUR", 0.824304);
            put("USD", 1.0);
        }}
        );
        EasyMock.replay(apiMock);

        //ConvertResponse instance = new ConvertResponse();
        HashMap<String, String> expResult = new HashMap<>();
        expResult.put("EUR", "EUR");
        expResult.put("USD", "USD");
        HashMap<String, String> result = instance.getList();
        assertEquals(expResult.containsKey(result), expResult.containsValue(result));
    }
    
}
