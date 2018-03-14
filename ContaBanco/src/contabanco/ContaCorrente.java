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
public class ContaCorrente {
    public int numero;
    private String nomeCliente;
    private double saldo = 0;
    private double limite = 0;
    private int agencia;

    public ContaCorrente(int numero, String nomeCliente, double limite, double saldo, int agencia) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.limite = limite;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public ContaCorrente(String numero, String nomeCliente, String limite, String saldo, String agencia) {
        this.numero = Integer.parseInt(numero);
        this.nomeCliente = nomeCliente;
        this.limite = Double.parseDouble(limite);
        this.saldo = Double.parseDouble(saldo);
        this.agencia = Integer.parseInt(agencia);
    }
    
    public boolean depositar (double valor){
        return valor>=0;
    }
    
    public boolean sacar(double valor){
        if (valor > 0 && (this.saldo-valor)>=0 && this.limite>valor){
            JOptionPane.showMessageDialog(null,"Saque bem sucedido!");
            return true;
        }
        else{ 
            JOptionPane.showMessageDialog(null,"Saque inválido!");
            return false;
        }
    }
    
    public void imprimirSaldo(){
        System.out.println("Prezado(a) " + nomeCliente + ",");
        System.out.println("seu saldo atual é: R$" + saldo);
    }
}
