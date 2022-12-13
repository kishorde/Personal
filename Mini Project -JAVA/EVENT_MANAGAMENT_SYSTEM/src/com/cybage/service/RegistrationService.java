package com.cybage.service;

import java.util.List;

import com.cybage.model.Registration;

public interface RegistrationService {
	
	

	public boolean AddUser(Registration registration);
	

	public Registration userLogin(Registration register);
	
	public List<Registration> getAllUsers();
	
	public Registration getUserProfileDetailsById(int userId);
	
	public boolean updateUserProfile(Registration register);
	
	
	
}
