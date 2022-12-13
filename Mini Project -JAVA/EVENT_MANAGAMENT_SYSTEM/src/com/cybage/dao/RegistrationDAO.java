package com.cybage.dao;

import java.util.List;

import com.cybage.model.AdminCategory;
import com.cybage.model.Registration;

public interface RegistrationDAO {

	public boolean AddUser(Registration registration);
	public Registration userLogin(Registration register);
	public List<Registration> getAllUsers();
	public Registration getUserProfileDetailsById(int userId);
	public boolean updateUserProfile(Registration register);
}
