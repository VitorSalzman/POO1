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

//Classe funciona como um cardápio
public abstract class Produto  {
    double precoUni;
    private String descricao;
    
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
