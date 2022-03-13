 
package br.edu.ifsul.cc.lpoo.clinicavet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Izolante
 */

@Entity
@Table (name = "tb_fornecedor")
public class Fornecedor extends Pessoa{
    
    @Column (nullable = false, length = 20)
    private String cnpj;
    
    @Column (nullable = false)
    private String  ie;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    
    
    
}
