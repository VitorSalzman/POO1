package exercinterfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serenna
 */
import java.util.List;
public class CalculaMedia implements ICalcula {  
    @Override
    public double calcula(List<Integer> lista){        
        int total=0;
        for(Integer item : lista){
            total+= item;
        }        
        double media = (total+0.0)/lista.size();
        return media;       
    }
}
