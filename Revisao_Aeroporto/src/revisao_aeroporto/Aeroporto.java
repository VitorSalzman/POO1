/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_aeroporto;

import java.util.ArrayList;

/**
 *
 * @author 20161bsi0403
 */

public class Aeroporto {
     private int codigo;
     private String nome;
     private boolean isInternacional = true;
     private ArrayList<Aeroporto> destinosDiretos;
     private ArrayList<Aeroporto> origensDiretas;
     private ArrayList<Aviao> avioesNoPatio;
     
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
    public boolean isInternacional(){
        return this.isInternacional;
    } 
    
    public void setIsInternacional(boolean situacao){
        this.isInternacional=situacao;
    }
    
    public boolean equals(Aeroporto aero, Aeroporto aero2){
        return aero.getCodigo()==aero2.getCodigo(); 
            
    }

    public ArrayList<Aviao> getAvioesNoPatio() {
        return avioesNoPatio;
    }
    
    
    
    public boolean estaPousado(Aeroporto aero,String prefixo){
        
        ArrayList<Aviao> listAvioes=aero.getAvioesNoPatio();
        for(int i=0; i<listAvioes.size();i++){
            if(listAvioes.get(i).getPrefixo()==prefixo){
                return true;
            }    
        }
        return false;
        
    }
}
