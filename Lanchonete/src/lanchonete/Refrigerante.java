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
public class Refrigerante extends Bebidas{
    private String marca;

    public Refrigerante(String marca, char tamanho, double precoUni, String descricao, int codigo) {
        super(tamanho, precoUni, descricao, codigo);
        this.marca = marca;
    }
    
    public Refrigerante(){
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
