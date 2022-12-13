package com.cybage.service;

import java.util.List;

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
	
	
	public List<Registration> getAllUsers()
	{
		return registrationdao.getAllUsers();
	}
	
	@Override
	public Registration getUserProfileDetailsById(int userId)
	{
		return registrationdao.getUserProfileDetailsById(userId);
	}
	public boolean updateUserProfile(Registration register)
	{
		return registrationdao.updateUserProfile(register);
	}
}
