/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpoint;

import java.util.ArrayList;

/**
 *
 * @author Salzman
 */
public class Cartao {
    private Categoria categoria;
    private int codigo;
    public boolean disponivel;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo>=0) this.saldo = saldo;
        else System.out.println("saldo invalido");
    }
    
    // Aqui n devia estar lidando com isso?
    public Cartao(String descricao){
                
            ArrayList linhasCadastradas = new ArrayList();
            linhasCadastradas = null;  //tratar a passagem da lista por parametro
            
            Categoria category = new Categoria(descricao,linhasCadastradas);
            this.categoria = category;

    }

    public String getNomeCategoria() {
        return categoria.getTipo();
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isDisponivel(Cartao card) {
        return disponivel;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

   
    
      
    
    
    
    
}