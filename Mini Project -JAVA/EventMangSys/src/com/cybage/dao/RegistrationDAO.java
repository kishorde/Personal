package com.cybage.dao;

import com.cybage.model.AdminCategory;
import com.cybage.model.Registration;

public interface RegistrationDAO {

	public boolean AddUser(Registration registration);
	public Registration userLogin(Registration register);
}
