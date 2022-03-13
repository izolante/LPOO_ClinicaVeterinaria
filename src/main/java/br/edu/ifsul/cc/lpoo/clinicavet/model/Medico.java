 
package br.edu.ifsul.cc.lpoo.clinicavet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Izolante
 */
@Entity
@Table (name = "tb_medico")

public class Medico extends Pessoa{
    
    @Column(nullable = false)
    private String numero_crmv;

    public String getNumero_crmv() {
        return numero_crmv;
    }

    public void setNumero_crmv(String numero_crmv) {
        this.numero_crmv = numero_crmv;
    }
    
    
}
