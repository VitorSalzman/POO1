/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpoint;

import java.util.ArrayList;

/**
 *
 * @author Serenna
 */
public class Estudante extends Categoria{
    private boolean gratuito;       // em vez de criar 2 classes, podemos gerenciar por aqui
    private ArrayList<String> linhasCadastradas = null;
    private final double desconto = 0.5;  // em um mundo ideal isso não se alterará 

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public ArrayList<String> getLinhasCadastradas() {
        if(this.gratuito)   return linhasCadastradas;
        else {
            System.out.println("Erro, estudante não gratuito não possui linhas cadastradas"); //desnecessário
            return null;
        }
    }

    public void setLinhasCadastradas(ArrayList<String> linhasCadastradas) {
        if (this.gratuito) this.linhasCadastradas = linhasCadastradas;
        else System.out.println("Erro, estudante não gratuito"); // Melhorar isso aqui HEUEHE(tratamento de erros necessario?)
    }
    
}
