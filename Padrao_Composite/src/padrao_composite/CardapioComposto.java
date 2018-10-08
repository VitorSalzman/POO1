/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_composite;

import java.util.ArrayList;

/**
 *
 * @author 20161BSI0403
 */
public class CardapioComposto implements Cardapio{
    private ArrayList<Cardapio> itens;
    private String descricao;
    @Override
    public String getItem() {
        return descricao;
    }

   
    
}
