/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_contacorrente;

import javax.swing.JOptionPane;

/**
 *
 * @author Salzman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(15.0);
        conta.setSaldo(conta.calculaTributos(conta));
        
        JOptionPane.showMessageDialog(null,conta.getSaldo());
    }
    
}
