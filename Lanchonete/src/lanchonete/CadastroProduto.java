/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

import javax.swing.JOptionPane;

/**
 *
 * @author 20161bsi0284
 */
public class CadastroProduto {
    public void cadastrandoEssaMerda(){
        String opcao = JOptionPane.showInputDialog("Escolha a opção\n(1)cadastrar produto \n(2)listar produtos JOptionPane \n(3)listar produtos Console\n");                             
        int opcaoEscolhida= Integer.parseInt(opcao);
        Listar listar = new Listar();
        if ( opcaoEscolhida == 1){
                Produto produto = new Produto();
                usuario.nomeCompleto = JOptionPane.showInputDialog("Nome completo:");
                usuario.login = JOptionPane.showInputDialog("Login:");
               while(true){
               try {            
                   usuario.setSenha(JOptionPane.showInputDialog("Senha:"));
                   break;
               } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null,ex.getMessage());
               }
               }
                ManipulaCSVUsuario.saveUsuario(usuario);
            }else if (opcaoEscolhida == 2){
                listar.listarJOptionPane();
            }else if (opcaoEscolhida == 3) {
                listar.listarConsole();
            }
    }
}
