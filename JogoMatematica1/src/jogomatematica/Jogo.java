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
    Questao[] lstQuestao;
    
    void iniciaJogo(){
        int typeQ = ThreadLocalRandom.current().nextInt(1,4);
        int qtdQuest = Integer.parseInt(JOptionPane.showInputDialog("Quantas questões deseja responder?")); //Transforma direto para int após pegar resposta no JOptionPane
        int index = 0;
        this.lstQuestao = new Questao[qtdQuest];
        
        while(index < qtdQuest ){
            switch(typeQ){
                case 1:
                {
                    QuestaoSoma novaQuest = new QuestaoSoma();
                    novaQuest.criarPergunta();
                    lstQuestao[index] = novaQuest;
                    pontosTotais.verificarQuestao(novaQuest);
                    //novaQuest.exibirResultado();
                    break;
                }
                case 2:
                {
                    QuestaoSubtracao novaQuest = new QuestaoSubtracao();
                    novaQuest.criarPergunta();
                    lstQuestao[index] = novaQuest;
                    pontosTotais.verificarQuestao(novaQuest);
                    //novaQuest.exibirResultado();
                    break;
                }
                case 3:
                {
                    QuestaoMultiplicacao novaQuest = new QuestaoMultiplicacao();
                    novaQuest.criarPergunta();
                    lstQuestao[index] = novaQuest;
                    pontosTotais.verificarQuestao(novaQuest);
                    //novaQuest.exibirResultado();
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro");
                    break;
                }
            }
            index++;
            typeQ = ThreadLocalRandom.current().nextInt(1,4);
        }
        
        
    }//Fim iniciaJogo
    
    //Relatório do Jogo
    void resultadoJogo(){
        String allQuests = "As questões foram: \n\n";
       
        for(Questao q: lstQuestao){
            if(q instanceof QuestaoSoma){
                allQuests+= q.operando1 + "+" + q.operando2+". ";
                if(q.verificarResposta())
                    allQuests+="Você acertou!";
                else
                    allQuests+="Você errou!";
            }
            else if(q instanceof QuestaoSubtracao){
                allQuests+= q.operando1 + "-" + q.operando2+". ";
                if(q.verificarResposta())
                    allQuests+="Você acertou!";
                else
                    allQuests+="Você errou!";
            }
            else if(q instanceof QuestaoMultiplicacao){
                allQuests+= q.operando1 + "*" + q.operando2+". ";
                if(q.verificarResposta())
                    allQuests+="Você acertou!";
                else
                    allQuests+="Você errou!";
            }
            allQuests+=" Sua resposta: "+q.resposta+"\n";
            
        }
        pontosTotais.exibirPontuacao();
        JOptionPane.showMessageDialog(null, allQuests);
        
    }
    
    
}
