package br.edu.unibratec.psc.dbdemo.itempedido;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User
 */
@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double desconto;

    private Integer codItemProduto;

    private Integer quantidade;

    private Double preco;

    public Double getDesconto() {
        return desconto;
    }

    public Integer getCodItemProduto() {
        return codItemProduto;
    }

    public void setCodItemProduto(Integer codItemProduto) {
        this.codItemProduto = codItemProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setDesconto(Double desconto){
        this.desconto = desconto;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
    
}