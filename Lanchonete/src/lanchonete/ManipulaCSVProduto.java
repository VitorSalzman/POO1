/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
        Double preco;
        ArrayList listaProdutos = new ArrayList();
        try{
            br = new BufferedReader(new FileReader(csvFile));
            while ((linha = br.readLine()) != null){
                arrayLinhaCSV = linha.split(",");
                if(arrayLinhaCSV[0].compareTo("hamburguer") == 0){
                    Hamburguer hamburguer = new Hamburguer();
                    hamburguer.setTipo(arrayLinhaCSV[1]);
                    preco = Double.parseDouble(arrayLinhaCSV[2]);
                    hamburguer.setValor(preco);
                    hamburguer.setDescricao(arrayLinhaCSV[3]);
                    listaProdutos.add(hamburguer);
                }
                else if (arrayLinhaCSV[0].compareTo("suco") == 0){
                    Suco suco = new Suco();
                    suco.setSabor(arrayLinhaCSV[1]);
                    preco = Double.parseDouble(arrayLinhaCSV[2]);
                    suco.setValor(preco);
                    suco.setDescricao(arrayLinhaCSV[3]);
                    listaProdutos.add(suco);
                }
                else if (arrayLinhaCSV[0].compareTo("refrigerante") == 0){
                    Refrigerante refrigerante = new Refrigerante();
                    refrigerante.setMarca(arrayLinhaCSV[1]);
                    preco = Double.parseDouble(arrayLinhaCSV[2]);
                    refrigerante.setValor(preco);
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
        String preco;
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
            preco = String.valueOf(produto.getValor());
            writer.append(preco);
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
               