/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomatematica;

import javax.swing.JOptionPane;

/**
 *
 * @author 20161bsi0284
 */
public class JogoMatematica {

    /**
     * @param args the command line arguments
     * transformar isso em classe "jogo"
     */
    public static void main(String[] ) {
        
       Jogo game = new Jogo();
       JOptionPane.showMessageDialog(null,"Quiz Matemático iniciado!");
       game.iniciaJogo();
    }
    
}
