/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

/**
 *
 * @author 20161bsi0284
 */
public class Bebidas extends Produto {
    private boolean comGelo = true;
    private char tamanho; // P = Copo/Lata de 350 ml, M = Copo/Garrafinha de 600 ml, G = Jarra de suco/Garrafa (1 L)

    public Bebidas(char tamanho, double precoUni, String descricao, int codigo) {
        super(precoUni, descricao, codigo);
        this.tamanho = tamanho;
    }
    public Bebidas(){}
    
    public char getTamanho() {
        return tamanho;
    }
    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    public boolean isComGelo() {
        return comGelo;
    }
    public void setComGelo(boolean comGelo) {
        this.comGelo = comGelo;
    }
}
