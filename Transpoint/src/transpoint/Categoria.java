/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpoint;

/**
 *
 * @author 20161bsi0403
 */
public abstract class Categoria {         
    public boolean limiteDiario ;        //Se possui ou não
    public int qtdDiaria;  // SE classe possui limite diário, qual é o numero?
    public String tipo; //Vale transporte, Passe Facil, idoso... etc.
    public boolean paga; //maybe
    public double valorTarifa;
    
    public void setQtdDiaria(int l){
        if (this.limiteDiario) this.qtdDiaria = l;
        else System.out.println("Operação ilegal. Categoria não tem limite diário"); // Não precisa disso mas talvez precisemos tentar
    }
    
    public int getQtdDiaria() {
        return qtdDiaria;
    }
        
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("ValeTransporte") || tipo.equalsIgnoreCase("PasseFacil")){
            this.tipo = tipo;
            this.paga = true;
        }
        else if (tipo.equalsIgnoreCase("Servico") || tipo.equalsIgnoreCase("Idoso")|| tipo.equalsIgnoreCase("PasseLivre")){
            this.tipo = tipo;
            this.paga = false;
        }
        
    }
    
    public boolean getLimiteDiario(){
        return limiteDiario;
    }
    
}
