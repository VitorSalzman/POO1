/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_aeroporto;

/**
 *
 * @author 20161bsi0403
 */
public class Aviao {
    String prefixo;
    String modelo;
    String fabricante;
    int quantAssentos;
    
    
    public Aviao(String prefixo, String modelo, String fabricante, int quantAssentos){
        this.prefixo=prefixo;
        this.modelo=modelo;
        this.fabricante=fabricante;
        this.quantAssentos=quantAssentos;
    }
    public String getPrefixo() {
        return prefixo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getQuantAssentos() {
        return quantAssentos;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo.toUpperCase();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.toUpperCase();
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante.toUpperCase();
    }

    public void setQuantAssentos(int quantAssentos) {
        this.quantAssentos = quantAssentos;
    }
    
    public String identificacao(Aviao aviao){
        return aviao.getPrefixo()+"-"+aviao.getModelo()+"-"+aviao.getFabricante()+"-"+aviao.getQuantAssentos();
    }
    
    
    
    
}
