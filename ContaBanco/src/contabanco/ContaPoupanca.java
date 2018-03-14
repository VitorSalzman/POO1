/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author 20161bsi0403
 */
public class ContaPoupanca {

    private int numero;
    private String nomeCliente;
    private double saldo = 0;
    private int agencia;

    public ContaPoupanca(int numero, String nomeCliente, double saldo, int agencia) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public ContaPoupanca(String numero, String nomeCliente, String saldo, String agencia) {
        this.numero = Integer.parseInt(numero);
        this.nomeCliente = nomeCliente;
        this.saldo = Double.parseDouble(saldo);
        this.agencia = Integer.parseInt(agencia);
    }
    
    public boolean depositar (double valor){
        if (valor>=0) return true;
        else return false;
    }
    
    public boolean sacar(double valor){
        if (valor > 0 && (this.saldo-valor)>=0){
            System.out.println("Saque bem sucedido!");
            return true;
        }
        else{ 
            System.out.println("Saque inválido!");
            return false;
        }
    }
    
    public void imprimirSaldo(){
        System.out.println("Prezado(a) " + nomeCliente + ",");
        System.out.println("seu saldo atual é: R$" + saldo);
    }
}
