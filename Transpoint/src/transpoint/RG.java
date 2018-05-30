/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpoint;

import java.util.Date;

/**
 *
 * @author Salzman
 */
public class RG {
    private Date dataNascimento;
    private String orgaoEmissor;
    private int codigo;

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public int getCodigo() {
        return codigo;
    }
    
    
    
}
