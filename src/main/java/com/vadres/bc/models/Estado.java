package com.vadres.bc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "estado", schema = "cep")
@Data
public class Estado {
    @Id
    @Column(name = "id")
	private Integer id;
	
    @Column(name = "nome")
	private String nome;
    
    @Column(name = "uf")
	private String uf;
}
