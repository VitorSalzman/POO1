/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomatematica;

import javax.swing.JOptionPane;

/**
 *
 * @author 20161bsi0284
 */
public class QuestaoSubtracao extends Questao{
    
    public QuestaoSubtracao (){
        this.pontos = 2;
    }
    @Override
    public boolean verificarResposta() {
        return (this.operando1 - this.operando2) == this.resposta;
    }
        
    public void criarPergunta(){
        String resp = JOptionPane.showInputDialog("Quanto é " + this.operando1 + " - " + this.operando2 + " ?");
        this.resposta = Integer.parseInt(resp); 
    }
}
