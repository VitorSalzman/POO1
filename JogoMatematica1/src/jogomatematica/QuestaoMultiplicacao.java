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
public class QuestaoMultiplicacao extends  Questao {
    
    public QuestaoMultiplicacao (){
        this.pontos = 4;
        /*Nas questões de multiplicação teremos números de 0 a 10 nos dois operandos*/
        this.operando1 = ThreadLocalRandom.current().nextInt(0, 11);
        this.operando2 = ThreadLocalRandom.current().nextInt(0, 11);
    }
    
    @Override
    public boolean verificarResposta() {
        return (this.operando1*this.operando2) == this.resposta;
    }
    
    public void criarPergunta(){
        String resp = JOptionPane.showInputDialog("Quanto é " + this.operando1 + " * " + this.operando2 + " ?");
        this.resposta = Integer.parseInt(resp); 
    }
}
