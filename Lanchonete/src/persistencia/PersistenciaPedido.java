/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lanchonete.ItemPedido;
import lanchonete.Pedido;
import lanchonete.Produto;

/**
 *
 * @author Serenna
 */
public class PersistenciaPedido {
    public static ArrayList<Pedido> readCSVFile() throws IOException {
        String csvFile = ".\\pedido.csv";
        String[] arrayLinhaCSV = null;
        String[] arrayItensPedidos = null;
        String[] arrayItemPedido = null;
        ArrayList<Pedido> listaPedidos = new ArrayList();
        List<Produto> produtos = PersistenciaProduto.readCSVFile(); //Carregando o cardápio na memória para associar o código ao produto que será necessário quando formos instanciar o ItemPedido
        Produto produto = null;
        BufferedReader br = null;
        String linha = "";
        Pedido pedido = null;
        
        try{
            br = new BufferedReader(new FileReader(csvFile));
            while ((linha = br.readLine())!= null){
                arrayLinhaCSV = linha.split(";");
                pedido = new Pedido(Integer.parseInt(arrayLinhaCSV[0]));
                pedido.setValor(Double.parseDouble(arrayLinhaCSV[2]));
                pedido.setAberto(false);
                arrayItensPedidos = arrayLinhaCSV[1].split("/"); //Possui cada itemPedido do pedido em cada posição, em forma de String
                
                //Campos de cada item separados por virgula, impedindo instanciação
                              
                for(int i = 0; i<arrayItensPedidos.length;i++){
                    ItemPedido item = new ItemPedido();
                    arrayItemPedido = arrayItensPedidos[i].split(",");
                    //Pedido possui apenas o código (e a descrição) do produto, para instanciar e setar para o ItemPedido, fizemos a associação do código ao cardápio 
                    int cod = Integer.parseInt(arrayItemPedido[0]);
                    for (Produto prod : produtos) {
                        if (prod.getCodigo() == cod) {
                            produto = prod;
                            break;
                        }
                    }
                    item.setProduto(produto);
                    item.setPreco(Double.parseDouble(arrayItemPedido[2]));
                    item.setQuantidade(Integer.parseInt(arrayItemPedido[3]));
                    pedido.adicionarItem(item);
                }
                listaPedidos.add(pedido);
            }
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        
        return listaPedidos;
    }
    
    public static void savePedido(Pedido pedido)throws IOException{
        if(pedido.isAberto()){
            pedido.fecharConta();
        }
        FileWriter writer = null;
        try {
            
            writer = new FileWriter(".\\pedido.csv", true);
            writer.append(pedido.getIdPedido() + ";");
            for (ItemPedido item : pedido.getLanche()) {
                writer.append(item.getProduto().getCodigo() + ",");
                writer.append(item.getProduto().getDescricao() + ",");
                writer.append(item.getPreco() + ",");
                writer.append(item.getQuantidade() + "/");
            }
            writer.append(pedido.getValor() + ";");
            writer.append("fechado\n");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
       
    }
}
