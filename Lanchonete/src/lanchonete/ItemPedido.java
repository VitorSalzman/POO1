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
    private Produto produto; 
    private String anotacao; // Ex: sem gelo, preço promocional, bem passado
    private int codItemP;
    private int codPedido;
    
    public ItemPedido(int codItemP){
        this.codItemP = codItemP;
    }
    
    public int getCodItemP() {
        return codItemP;
    }

    public void setCodItemP(int codItemP) {
        this.codItemP = codItemP;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public Produto getProduto() {
        return produto;
    }
    
    public ItemPedido(){
        
    }

    public ItemPedido(int quantidade, double preco, Produto produto, String anotacao) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
        this.anotacao = anotacao;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }
    
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


