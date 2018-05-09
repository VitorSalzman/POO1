/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

import java.io.Serializable;

/**
 *
 * @author 20161bsi0284
 */

//Classe funciona como um cardápio
public abstract class Produto implements Serializable  {
    double precoUni;        //Valor unitário
    String nome;            //Nome "fantasia" do produto
    private String descricao;       //Descrição do Produto (Detalhes do que é feito)
    private int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto(double precoUni, String descricao, int codigo) {
        this.precoUni = precoUni;
        this.descricao = descricao;
        this.codigo = codigo;
    }
    public Produto(){}
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return precoUni;
    }
    public void setValor(double valor) {
        if(valor>0){
            this.precoUni = valor;    
        }        
    }
}
