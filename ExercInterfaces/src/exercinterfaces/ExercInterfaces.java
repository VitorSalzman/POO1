/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercinterfaces;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Serenna
 */
public class ExercInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //complete o código para chamar o método calcula para a média  
        ICalcula media = new CalculaMedia();
        Double r = calcula(media);
        System.out.println("Resultado média: " + r);
        
        ICalcula mediana = new CalculaMediana();
        r = calcula(mediana);
        System.out.println("Resultado mediana: " + r); 
                        
    }    
    public static double calcula(ICalcula operacao){        
      List<Integer> lista = new ArrayList();        
      lista.add(1);
      lista.add(2); 
      lista.add(3); 
      lista.add(4); 
      lista.add(5); 
      lista.add(6);
      double resultado = operacao.calcula(lista);
      return resultado;              
    }       
}
