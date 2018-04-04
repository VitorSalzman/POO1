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
    private int numero;
    private String nomeCliente;
    private double saldo = 0;
    private double limite = 0;
    private int agencia;

    public ContaCorrente(int numero, String nomeCliente, double limite, double saldo, int agencia) throws Exception {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.limite = limite;
        this.setSaldo(saldo);
        this.agencia = agencia;
    }

    public ContaCorrente(String numero, String nomeCliente, String limite, String saldo, String agencia) throws Exception {
        this.numero = Integer.parseInt(numero);
        this.nomeCliente = nomeCliente;
        this.limite = Double.parseDouble(limite);
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
    
    public void sacar(double valor) throws Exception {
        try{
            if (valor > 0) {
                if (this.saldo - valor >= 0) {
                    this.saldo -= valor;
                    JOptionPane.showMessageDialog(null, "Saque bem sucedido!");
                } else if (this.limite >= valor) {
                    this.limite -= valor;
                    JOptionPane.showMessageDialog(null, "Saque bem sucedido!");
                } else {
                    throw new Exception("Você não possui o limite necessário para esta operação.");
                }
            } else {
                throw new Exception("Você informou um valor negativo.");
            }
        }
        catch (Exception ex){
            System.out.println("Conta:");
            ex.printStackTrace();
            throw ex;
        }
    }
    
    public void imprimirSaldo(){
        JOptionPane.showMessageDialog(null,"Prezado(a) " + nomeCliente + ",seu saldo atual é: R$" + saldo);
    }
}
