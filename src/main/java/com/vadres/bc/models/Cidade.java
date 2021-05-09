package com.vadres.bc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cidade", schema = "cep")
@Data
public class Cidade {
    @Id
    @Column(name = "id")
	private Integer id;
	
    @Column(name = "nome")
	private String nome;    

    @Column(name = "cidade_estado")
	private String cidadeEstado;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado")
    private Estado estado;
    
    @Override
    public String toString() {
    	return nome + " " + estado.getNome(); 
    }
}
