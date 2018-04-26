package persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import lanchonete.Hamburguer;
import lanchonete.Suco;
import lanchonete.Refrigerante;
import lanchonete.Produto;

/**
 *
 * @author Serenna
 */
public class ManipulaCSVProduto {
    
    public static ArrayList readCSVFile(){
        String csvFile = ".\\file.csv";
        String[] arrayLinhaCSV = null;
        BufferedReader br = null;
        String linha = "";
        ArrayList<Produto> listaProdutos = new ArrayList();
        try{
            br = new BufferedReader(new FileReader(csvFile));
            while ((linha = br.readLine()) != null){
                arrayLinhaCSV = linha.split(",");
                if(arrayLinhaCSV[0].equalsIgnoreCase("hamburguer")){
                    Hamburguer hamburguer = new Hamburguer();
                    hamburguer.setTipo(arrayLinhaCSV[1]);
                    hamburguer.setValor(Double.parseDouble(arrayLinhaCSV[2]));
                    hamburguer.setDescricao(arrayLinhaCSV[3]);
                    listaProdutos.add(hamburguer);
                }
                else if (arrayLinhaCSV[0].equalsIgnoreCase("suco")){
                    Suco suco = new Suco();
                    suco.setSabor(arrayLinhaCSV[1]);
                    suco.setValor(Double.parseDouble(arrayLinhaCSV[2]));
                    suco.setDescricao(arrayLinhaCSV[3]);
                    listaProdutos.add(suco);
                }
                else if (arrayLinhaCSV[0].equalsIgnoreCase("refrigerante")){
                    Refrigerante refrigerante = new Refrigerante();
                    refrigerante.setMarca(arrayLinhaCSV[1]);
                    refrigerante.setValor(Double.parseDouble(arrayLinhaCSV[2]));
                    refrigerante.setDescricao(arrayLinhaCSV[3]);
                    listaProdutos.add(refrigerante);
                }  
            }             
        }  catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }   catch (IOException ex) {
            ex.printStackTrace();
        }   finally {
            if (br != null){
               try{
                   br.close();
               } catch (IOException ex) {
                   ex.printStackTrace();
               }
            }
        }
        return listaProdutos;
    }
    public static void saveProduto(Produto produto){
        try{
            FileWriter writer = new FileWriter(".\\file.csv",true);
            if (produto instanceof Hamburguer){
                writer.append("hamburguer");
                writer.append(',');
                writer.append(((Hamburguer) produto).getTipo());
            } else if (produto instanceof Suco){
                writer.append("suco");
                writer.append(',');
                writer.append(((Suco) produto).getSabor());
            } else if (produto instanceof Refrigerante){
                writer.append("refrigerante");
                writer.append(',');
                writer.append(((Refrigerante) produto).getMarca());
            }
            writer.append(',');
            writer.append(String.valueOf(produto.getValor()));
            writer.append(',');
            writer.append(produto.getDescricao());
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
               
