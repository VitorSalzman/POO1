/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

import java.util.ArrayList;

/**
 *
 * @author 20161bsi0284
 */
public class Pedido {
    private double valor;
    private ArrayList lanche = new ArrayList(); 
    private boolean aberto = true;
    private int index=0;
       
    void fecharConta(){
        
    
    }
    void adicionarItem(ItemPedido item){
        lanche.add(item);
        
    }
    
    public void listaProdutos(){
        
    }
}
