/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

/**
 *
 * @author 20161bsi0284
 */
public class ItemPedido {
    private int quantidade;
    private double preco; //preço cobrado na hora, pode ser mantido como histórico e permite a possibilidade de aplicar descontos

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}   


