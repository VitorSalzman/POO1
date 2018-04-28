/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import lanchonete.Hamburguer;
import lanchonete.Produto;
import lanchonete.Suco;
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
        Hamburguer aburg = new Hamburguer ("Frango",21,"Filé de frango assado, alface, maionese, queijo mussarela duplo",2);
        Suco juice = new Suco("Laranja", 'M', 6, "Suco de laranjas feito na hora, c/ açúcar", 12);
        
        ManipulaCSVProduto.saveProduto(aburg);
        ManipulaCSVProduto.saveProduto(juice);
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
        ArrayList<Produto> produtos = ManipulaCSVProduto.readCSVFile();       
        Produto produto = produtos.get(0);
        assertEquals(2,produto.getCodigo());      
        for (int i  = 0; i< produtos.size() ; i++){            
            if (produtos.get(i) == null){
                fail ("Produto não salvo");
            } 
        }
    }

    /**
     * Test of saveProduto method, of class ManipulaCSVProduto.
    
    @Test
    public void testSaveProduto() {
        System.out.println("saveProduto");
        Produto produto = null;
        ManipulaCSVProduto.saveProduto(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
    
}
