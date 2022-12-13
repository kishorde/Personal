package com.cybage.service;

import com.cybage.model.Registration;

public interface RegistrationService {
	
	

	public boolean AddUser(Registration registration);
	

	public Registration userLogin(Registration register);
}
