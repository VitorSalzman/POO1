/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

import javax.swing.JOptionPane;

/**
 *
 * @author 20161bsi0403
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tipoConta = JOptionPane.showInputDialog("Digite 1 para Conta Poupança e 2 para Conta corrente.");
        
        switch (tipoConta) {
            case "1":
                {
                    String numConta = JOptionPane.showInputDialog("Digite o numero da conta");
                    String numAgencia = JOptionPane.showInputDialog("Digite a agência");
                    String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
                    String saldoInicial = JOptionPane.showInputDialog("Digite saldo");
                    ContaPoupanca conta1 = null;
                    try {
                        conta1 =  new ContaPoupanca (numConta, nomeCliente, saldoInicial, numAgencia);
                        //conta1.depositar(-120);
                    } catch (Exception salz) {
                        JOptionPane.showMessageDialog(null, salz.getMessage());
                    }
                    conta1.imprimirSaldo();
                    break;
                }
            case "2":
                {
                    String numConta = JOptionPane.showInputDialog("Digite o numero da conta");
                    String numAgencia = JOptionPane.showInputDialog("Digite a agência");
                    String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
                    String limiteInicial = JOptionPane.showInputDialog("Digite o limite");
                    String saldoInicial = JOptionPane.showInputDialog("Digite saldo");
                    ContaCorrente conta1 = null;
                    try {                  
                        conta1 = new ContaCorrente(numConta, nomeCliente, limiteInicial, saldoInicial, numAgencia);
                        int deposit = JOptionPane.showConfirmDialog(null, "Deseja depositar algum valor?");
                        if (deposit == 0){
                            conta1.depositar(120);
                        }
                    } catch (Exception salz) {
                        JOptionPane.showMessageDialog(null, salz.getMessage());
                    }
                    conta1.imprimirSaldo();
                    break;
                }
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida;");
                break;
        }
        
    }

}
