package com.gmail.carmonespi.app.service;

import java.util.List;

import com.gmail.carmonespi.app.entity.Turno;

public interface ITurnoService {
	public List<Turno> findAll();
	public void save(Turno turno);
	public Turno findOne(Long id );
	public void delete( Long id );
}
