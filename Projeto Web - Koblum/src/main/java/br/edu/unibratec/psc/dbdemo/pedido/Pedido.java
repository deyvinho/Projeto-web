package br.edu.unibratec.psc.dbdemo.pedido;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User
 */
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    private Date dataPedido;

    public Integer getCodigo() {
        return codigo;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

   
}