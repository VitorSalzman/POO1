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
    private double valor;       //Valor final do pedido
    private ArrayList<ItemPedido> lanche = new ArrayList(); //Array dinâmico para objetos de pedidos feitos
    private boolean aberto = true;      //Pedido em aberto → Ainda podem pedir, adicionar mais coisas
    private int index=0;        //Variável para percorrer a array
    
    //Calcula o valor final do pedido e seta o status para fechado
    void fecharConta(){
         for(index = 0; index < lanche.size(); index++){
             ItemPedido item = (ItemPedido)lanche.get(index);
             this.valor+= item.getPreco()*item.getQuantidade();   
         }
         System.out.println("Valor total: "+valor);
         this.aberto = false;
    }
    //Adiciona o objeto na array
    void adicionarItem(ItemPedido item){
        lanche.add(item);
    }
    //Apenas coloca na tela o "nome" (descrição), preço unitário e quantidade
    public void listaProdutos(){
        for(index = 0; index < lanche.size(); index++){
            ItemPedido item = (ItemPedido)lanche.get(index);
            System.out.println(item.getProduto().getDescricao() + "Preco " + item.getPreco()+ " Qtd "+item.getQuantidade());
        }
    }
}
