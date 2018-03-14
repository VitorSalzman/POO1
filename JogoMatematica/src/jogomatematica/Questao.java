/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomatematica;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author 20161bsi0284
 */
public abstract class Questao {

    int operando1;
    int operando2;
    int pontos;
    int resposta;

    public Questao() {
        this.operando1 = ThreadLocalRandom.current().nextInt(2, 10);
        this.operando2 = ThreadLocalRandom.current().nextInt(20, 40);
    }

    public abstract boolean verificarResposta();

    public void exibirResultado() {
        if (this.verificarResposta()) {
            JOptionPane.showMessageDialog(null, "Você acertou!");
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
        }
    }
}
