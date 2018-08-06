/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_contacorrente;


/**
 *
 * @author Salzman
 */
public class ContaCorrente extends Conta implements Tributavel{
    
    /*public ContaCorrente(double saldo){
        this.saldo.setSaldo(saldo);
    }*/
    @Override
    public double calculaTributos(Conta conta) {
        return conta.getSaldo()*0.10;
    }
    
    
}
