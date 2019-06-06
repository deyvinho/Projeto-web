package br.edu.unibratec.psc.dbdemo.usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer id;

    private String nome;

    private String email;

    private String cpfOucnpj;

    public Integer getId(){
        return id;
    }
    
    public void setId (Integer id){
        this.id = id;
    }
    
    public String getCpfOucnpj() {
        return cpfOucnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpfOucnpj(String cpfOucnpj) {
        this.cpfOucnpj = cpfOucnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}