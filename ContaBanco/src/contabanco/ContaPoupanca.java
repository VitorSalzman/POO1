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
public class ContaPoupanca {

    private int numero;
    private String nomeCliente;
    private double saldo = 0;
    private int agencia;

    public ContaPoupanca(int numero, String nomeCliente, double saldo, int agencia) throws Exception {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.setSaldo(saldo);
        this.agencia = agencia;
    }

    public ContaPoupanca(String numero, String nomeCliente, String saldo, String agencia) throws Exception {
        this.numero = Integer.parseInt(numero);
        this.nomeCliente = nomeCliente;
        this.setSaldo(saldo);
        this.agencia = Integer.parseInt(agencia);
    }
    
    public void setSaldo(double saldo) throws Exception{
        if (saldo>=0) this.saldo = saldo;
        else throw new Exception ("Saldo não pode ser negativo");
    }
     public void setSaldo(String saldo) throws Exception{
        double saldoAtual = Double.parseDouble(saldo);
        if (saldoAtual>=0) this.saldo = saldoAtual;
        else throw new Exception ("Saldo não pode ser negativo");
    }
    
    public void depositar (double valor) throws Exception{
        if (valor>=0) 
            this.saldo+=valor;
        else
            throw new Exception("Você informou um valor negativo.");
       
    }
    
    public void sacar(double valor) throws Exception{
        if (valor > 0 && (this.saldo - valor) >= 0) {
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque bem sucedido!");
        } else {
            throw new Exception("Você não possui o saldo necessário para esta operação.");
        }
    }    
    
    public void imprimirSaldo(){
        JOptionPane.showMessageDialog(null,"Prezado(a) " + nomeCliente + ",seu saldo atual é: R$" + saldo);
    }
}
