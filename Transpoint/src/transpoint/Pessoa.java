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
public abstract class Pessoa {
    public String nome;
    public ArrayList<Cartao> cartoesTranscol;
    
    public  void setNome(String nome){
        this.nome = nome;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public void addCartao(Cartao card){
        cartoesTranscol.add(card);
    }
    
    public boolean removeCartao(ArrayList<Cartao> listaCartoes, Cartao card){
        
        boolean removido = false;
        for(int i =0; i<listaCartoes.size();i++){
            if(Cartao.comparaCartao(listaCartoes.get(i),card)){
                listaCartoes.remove(i);
                removido = true;
            }
        }
        return removido;
        
    }
    
    public void listarCartoes(ArrayList<Cartao> cards){
        for(Cartao card : cards){
            System.out.println(" 1 - " + Cartao.getTipo(card) + ";");
        }
    }
    
    
    
    
}
