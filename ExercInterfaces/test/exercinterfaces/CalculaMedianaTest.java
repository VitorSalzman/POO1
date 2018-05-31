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
public class CalculaMedianaTest {
    
    public CalculaMedianaTest() {
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
     * Test of calcula method, of class CalculaMediana.
     */
    @Test
    public void testCalcula() {
        System.out.println("calcula mediana");
        List<Integer> lista = new ArrayList();        
        lista.add(1);
        lista.add(2); 
        lista.add(3); 
        lista.add(4); 
        lista.add(5); 
        lista.add(6); 
        CalculaMediana instance = new CalculaMediana();
        double expResult = 3.5;
        double result = instance.calcula(lista);
        assertEquals(expResult, result, 1); 
    }
    
}
