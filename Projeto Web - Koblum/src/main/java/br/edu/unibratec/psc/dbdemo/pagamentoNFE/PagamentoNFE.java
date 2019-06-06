package br.edu.unibratec.psc.dbdemo.pagamentoNFE;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User
 */
@Entity
public class PagamentoNFE {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nrFiscal;
    private String nomeProduto;
    private Date dataCompra;
    private Integer numeroDeParcelas;

    public Integer getNrFiscal() {
        return nrFiscal;
    }

    public void setNrFiscal(Integer nrFiscal) {
        this.nrFiscal = nrFiscal;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }



  

 
}


