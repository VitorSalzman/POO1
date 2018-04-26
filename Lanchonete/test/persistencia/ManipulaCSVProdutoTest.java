/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import lanchonete.Produto;
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
public class ManipulaCSVProdutoTest {
    
    public ManipulaCSVProdutoTest() {
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
     * Test of readCSVFile method, of class ManipulaCSVProduto.
     */
    @Test
    public void testReadCSVFile() {
        System.out.println("readCSVFile");
        ArrayList expResult = null;
        ArrayList result = ManipulaCSVProduto.readCSVFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveProduto method, of class ManipulaCSVProduto.
     */
    @Test
    public void testSaveProduto() {
        System.out.println("saveProduto");
        Produto produto = null;
        ManipulaCSVProduto.saveProduto(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
