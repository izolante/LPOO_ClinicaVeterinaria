 
package br.edu.ifsul.cc.lpoo.clinicavet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 *
 * @author Izolante
 */
@Entity
@Table (name = "tb_funcionario")
public class Funcionario extends Pessoa{
    
    @Column(nullable = false)
    private String numero_ctps;
    
    @Column(nullable = false)
    private String numero_pis;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Cargo cargo;

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public String getNumero_pis() {
        return numero_pis;
    }

    public void setNumero_pis(String numero_pis) {
        this.numero_pis = numero_pis;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
}
