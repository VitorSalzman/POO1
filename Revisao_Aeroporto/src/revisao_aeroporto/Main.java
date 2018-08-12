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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao("PPR","AR1","EMBRAER",44);
        Aviao aviao2 = new Aviao("PRR","AR2","GOL",45);
        Aeroporto aero = new Aeroporto(111,"AAA",true);
        
        aero.estacionaAviao(aviao2);
        aero.estacionaAviao(aviao1);
        if(aero.estaPousado(aero, aviao1.getPrefixo())){
            System.out.println("TRUEE");
        }
        
    }
    
}
