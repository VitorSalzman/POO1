/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercinterfaces;

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
 * @author Serenna
 */
public class CalculaMediaTest {
    
    public CalculaMediaTest() {
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
     * Test of calcula method, of class CalculaMedia.
     */
    @Test
    public void testCalcula() {
        System.out.println("testando a media");
        List<Integer> lista = new ArrayList();
        lista.add(10);
        lista.add(8);        
        CalculaMedia instance = new CalculaMedia();
        double expResult = 9.0;
        double result = instance.calcula(lista);
        assertEquals(expResult, result, 1); 
    }
    
}
