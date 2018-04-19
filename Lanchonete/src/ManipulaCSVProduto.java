
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import lanchonete.Hamburguer;
import lanchonete.Produto;


public class ManipulaCSVProduto {
   
    public static ArrayList readCSVFile() {
        String csvFile = ".\\file.csv";
        String[] arrayLinhaCSV = null;
        BufferedReader br = null;
        String line = "";        
        ArrayList listaProdutos = new ArrayList(); //Cardápio
        try {
            br = new BufferedReader(new FileReader(csvFile));                        
            while ((line = br.readLine()) != null) {                
                arrayLinhaCSV = line.split(",");//split quebra            
                Produto produto;
                if (arrayLinhaCSV[3].contains("Hamburguer")){
                   produto = new Hamburguer();
                   produto.setDescricao(arrayLinhaCSV[0]);
                   ((Hamburguer)produto).setTipo(arrayLinhaCSV[3]);
                   
                
                }
                
                
                listaUsuario.add(produto);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return listaUsuarios;
    }
    public static void saveProduto(Produto produto) {
        try {
            FileWriter writer = new FileWriter(".\\file.csv", true);
            writer.append(produto.nomeCompleto);                        
            writer.append(',');            
            writer.append(produto.login);
            writer.append(',');            
            writer.append(produto.senha);
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
