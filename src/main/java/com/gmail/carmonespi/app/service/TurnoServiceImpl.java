package com.gmail.carmonespi.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gmail.carmonespi.app.dao.ITurnoDao;
import com.gmail.carmonespi.app.entity.Turno;

@Service
public class TurnoServiceImpl implements ITurnoService {
	
	@Autowired
	private ITurnoDao turnoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Turno> findAll() {
		return (List<Turno>) turnoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public void save(Turno turno) {
		turnoDao.save(turno);
	}

	@Override
	public Turno findOne(Long id) {
		return turnoDao.findOne(id);
	}

	@Override
	@Transactional(readOnly=true)
	public void delete(Long id) {
		turnoDao.delete(id);
	}
	
}
