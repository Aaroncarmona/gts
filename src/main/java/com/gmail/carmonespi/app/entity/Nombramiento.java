package com.gmail.carmonespi.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nombramientos")
public class Nombramiento implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String nombramiento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombramiento() {
		return nombramiento;
	}

	public void setNombramiento(String nombramiento) {
		this.nombramiento = nombramiento;
	}

	private static final long serialVersionUID = 1L;
}
