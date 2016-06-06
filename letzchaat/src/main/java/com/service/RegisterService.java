package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.RegisterDAOImpl;
import com.model.Register;

@Service
@Transactional
public class RegisterService {
	@Autowired(required=true)
	RegisterDAOImpl rd;
	
	public void addUser(Register r)
	{
	 rd.addUser(r);
	}

}
