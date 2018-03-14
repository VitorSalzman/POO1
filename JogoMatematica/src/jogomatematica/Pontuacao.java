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
public class Pontuacao {
    int totalPontos;
    int qtdQuestoes;
    
    void exibirPontuacao(){
        JOptionPane.showMessageDialog(null,"Você marcou " +totalPontos+ " ponto(s) e respondeu "+qtdQuestoes+" questões.");
    }
    void verificarQuestao(Questao quest){
        if (quest.verificarResposta())
            this.totalPontos += quest.pontos;
        qtdQuestoes++; 
    }
}
