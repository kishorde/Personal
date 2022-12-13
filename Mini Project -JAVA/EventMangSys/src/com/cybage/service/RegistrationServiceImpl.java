package com.cybage.service;

import com.cybage.dao.RegistrationDAO;
import com.cybage.dao.RegistrationDAOImpl;
import com.cybage.model.Registration;

public class RegistrationServiceImpl implements RegistrationService{
	
	RegistrationDAO registrationdao = new RegistrationDAOImpl();

	@Override
	public boolean AddUser(Registration registration)
	{
		return registrationdao.AddUser(registration);
	}

	@Override
	public Registration userLogin(Registration register) {
		// TODO Auto-generated method stub
		return registrationdao.userLogin(register);
	}
	
	
}
