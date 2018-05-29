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
public class PessoaFisica extends Pessoa {
    private int cpf;
    private String dataNascimento;
    

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    
}
