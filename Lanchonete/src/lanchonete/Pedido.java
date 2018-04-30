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
    private int idPedido;
    private double valor;       //Valor final do pedido
    private ArrayList<ItemPedido> lanche = new ArrayList(); //Array dinâmico para objetos de pedidos feitos
    private boolean aberto = true;      //Pedido em aberto → Ainda podem pedir, adicionar mais coisas
    private int index=0;        //Variável para percorrer a array

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }
   
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
        
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public boolean isAberto() {
        return aberto;
    } 
    
    //Calcula o valor final do pedido e seta o status para fechado (Considerado "setValor")
    public void fecharConta() {
        for (index = 0; index < lanche.size(); index++) {
            ItemPedido item = (ItemPedido) lanche.get(index);
            this.valor += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor total: " + valor);
        this.aberto = false;
    }

    //Adiciona o objeto na array
    public void adicionarItem(ItemPedido item){
        lanche.add(item);
    }

    public void setValor(double valor) {
        if (valor >=0){
            this.valor = valor;
        }
    }
    //Apenas coloca na tela o "nome" (descrição), preço unitário e quantidade
    public void listaProdutos(){
        for(index = 0; index < lanche.size(); index++){
            ItemPedido item = (ItemPedido)lanche.get(index);
            System.out.println(item.getProduto().getDescricao() + "Preço " + item.getPreco()+ " Qtd "+item.getQuantidade());
        }
    }

    public double getValor() {
        return valor;
    }

    public ArrayList<ItemPedido> getLanche() {
        return lanche;
    }
}
