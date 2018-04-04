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
        //Escolhendo o tipo da conta
        String tipoConta = JOptionPane.showInputDialog("Digite 1 para Conta Poupança e 2 para Conta corrente.");
        double num;     //Valor que o usuário digitará para depósito/saque
        int operacao;   //"Verificador" caso o usuário queira fazer depósito/saque
        
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
                        operacao = JOptionPane.showConfirmDialog(null, "Deseja depositar algum valor?");
                        if (operacao == 0){
                            num = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia"));
                            conta1.depositar(num);
                        }
                        operacao = JOptionPane.showConfirmDialog(null, "Deseja sacar algum valor?");
                        if (operacao == 0){
                            num = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia"));
                            conta1.sacar(num);
                        }
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
                    String saldoInicial = JOptionPane.showInputDialog("Digite saldo inicial");
                    ContaCorrente conta1 = null;
                    try {                  
                        conta1 = new ContaCorrente(numConta, nomeCliente, limiteInicial, saldoInicial, numAgencia);
                        operacao = JOptionPane.showConfirmDialog(null, "Deseja depositar algum valor?");
                        if (operacao == 0){
                            num = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia"));
                            conta1.depositar(num);
                        }
                        operacao = JOptionPane.showConfirmDialog(null, "Deseja sacar algum valor?");
                        if (operacao == 0){
                            num = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia"));
                            conta1.sacar(num);
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
