/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpoint;

/**
 *
 * @author Salzman
 */
public class Cartao {
    
    public Categoria categoria;   //Pago ou gratuita
    public int codigo;
    public boolean disponivel;
    
    // Aqui n devia estar lidando com isso?
    public Cartao(String categoria){
        if((categoria.equalsIgnoreCase("EstudanteGratuito")) || (categoria.equalsIgnoreCase("Idoso")) || (categoria.equalsIgnoreCase("PasseLivre"))){
            
            if(categoria.equalsIgnoreCase("EstudanteGratuito")){
                EstudanteGratuito categoria = new EstudanteGratuito(365,"linhas-cadastradas-aqui");
                
            }   
            else{
                Gratuito categoria = new Gratuito(365);
                
            }
            
            this.categoria.setTipo(categoria);
        }
        else if((categoria.equalsIgnoreCase("Estudante")) || (categoria.equalsIgnoreCase("PasseFacil")) || (categoria.equalsIgnoreCase(ValeTransporte)) || (categoria.equalsIgnoreCase("Servico"))){
            Paga categoria = new Paga(true); //True refere-se ao atributo 'integral' de Paga
            this.categoria.setTipo(categoria);
        }
        
        else{
            //tratamento de erro.
        }
     
        
        
    }

    public String getCategoria(Cartao card) {
        if (card.categoria instanceof Gratuito){
            return "Gratuito";
            
        }
        return "Paga";
    }

    public int getCodigo(Cartao card) {
        return codigo;
    }

    public boolean isDisponivel(Cartao card) {
        return disponivel;
    }

   

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    
    
    
    
    
}
