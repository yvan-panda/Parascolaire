package com.zsmart.parascolaire.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Salle;
import com.zsmart.parascolaire.dao.SalleDao;
import com.zsmart.parascolaire.model.facade.SalleService;

@Service
public class SalleServiceImpl implements SalleService {
	
	@Autowired
	private SalleDao salleDao;

	

	@Override
	public void save(Salle salle) {
		// TODO Auto-generated method stub
		salleDao.save(salle);
	}

	@Override
	public List<Salle> findAll() {
		// TODO Auto-generated method stub
		return salleDao.findAll();
	}
	
	
}