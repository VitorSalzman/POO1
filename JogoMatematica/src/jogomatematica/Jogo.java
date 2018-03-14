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
public class Jogo {
    
    Pontuacao pontosTotais = new Pontuacao(); 
    
    void iniciaJogo(){
        int typeQ = ThreadLocalRandom.current().nextInt(1,4);
        boolean flag = true;
        
        while(flag){
            switch(typeQ){
                case 1:
                {
                    QuestaoSoma novaQuest = new QuestaoSoma();
                    novaQuest.criarPergunta();
                    pontosTotais.verificarQuestao(novaQuest);
                    novaQuest.exibirResultado();
                    break;
                }
                case 2:
                {
                    QuestaoSubtracao novaQuest = new QuestaoSubtracao();
                    novaQuest.criarPergunta();
                    pontosTotais.verificarQuestao(novaQuest);
                    novaQuest.exibirResultado();
                    break;
                }
                case 3:
                {
                    QuestaoMultiplicacao novaQuest = new QuestaoMultiplicacao();
                    novaQuest.criarPergunta();
                    pontosTotais.verificarQuestao(novaQuest);
                    novaQuest.exibirResultado();
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro");
                    break;
                }
            }
            if (JOptionPane.showConfirmDialog(null,"Deseja continuar jogando? Digite S caso queira") == 0)
                flag = true;
            else flag = false;
            typeQ = ThreadLocalRandom.current().nextInt(1,4);
        }
        pontosTotais.exibirPontuacao();
    }
}
