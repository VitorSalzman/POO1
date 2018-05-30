/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpoint;

import java.util.Date;

/**
 *
 * @author Serenna
 */
public class Tarifa {
    public Date dataHorario; //vai guardar data e horário da tarifagem
    public int linha;      // linha usada na tarifagem
    public Cartao card;     //Informações do cartão utilizado aqui?
    public double valorPago;        //Valor descontado do saldo do cartão na respectiva tarifa
    
    
}
