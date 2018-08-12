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
     private ArrayList<String> destinosDiretos;
     private ArrayList<String> origensDiretas;
     private ArrayList<Aviao> avioesNoPatio;
     
    public Aeroporto(int codigo, String nome, boolean isInternacional){
        this.codigo=codigo;
        this.nome=nome;
        this.isInternacional=isInternacional;
        this.avioesNoPatio = new ArrayList<Aviao>();
        this.destinosDiretos = new ArrayList<String>();
        this.origensDiretas = new ArrayList<String>();
     
    }
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

    public boolean isInternacional() {
        return isInternacional;
    }

    public ArrayList<String> getDestinosDiretos() {
        return destinosDiretos;
    }

    public ArrayList<String> getOrigensDiretas() {
        return origensDiretas;
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
    
    public void estacionaAviao(Aviao aviao){
        this.avioesNoPatio.add(aviao);
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
