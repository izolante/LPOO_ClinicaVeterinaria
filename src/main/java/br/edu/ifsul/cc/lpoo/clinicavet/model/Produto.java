 
package br.edu.ifsul.cc.lpoo.clinicavet.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Izolante
 */
@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_produto", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private Float valor;
    
    @Column(nullable = false)
    private Float quantidade;
    
    @ManyToOne
    @JoinColumn(name = "fornecedor_id", nullable = false)
    private Fornecedor fornecedor;
    
    @ManyToOne
    @JoinColumn(name = "tipoproduto", nullable = false)
    private TipoProduto tipoproduto;
    
    @ManyToMany
    @JoinTable(name = "tb_venda_produto", joinColumns = {@JoinColumn(name = "produto_id")}, //agregacao
                                       inverseJoinColumns = {@JoinColumn(name = "venda_id")})
     private List <Venda> vendas;
    
    @ManyToMany
    @JoinTable(name = "tb_receita_produto", joinColumns = {@JoinColumn(name = "produto_id")}, //agregacao
                                       inverseJoinColumns = {@JoinColumn(name = "receita_id")})
     private List <Receita> Receitas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public TipoProduto getTipoproduto() {
        return tipoproduto;
    }

    public void setTipoproduto(TipoProduto tipoproduto) {
        this.tipoproduto = tipoproduto;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public List<Receita> getReceitas() {
        return Receitas;
    }

    public void setReceitas(List<Receita> Receitas) {
        this.Receitas = Receitas;
    } 
    
}

