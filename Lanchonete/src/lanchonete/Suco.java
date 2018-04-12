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
public class Suco extends Bebidas{
    private String sabor;
    private boolean comAcucar = true; 
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}
