package com.cybage.dao;

import java.util.List;

import com.cybage.model.Booking;

public interface BookingDAO {

	public boolean BookEvent(Booking bookevent);
	
	public List<Booking> getBookedEventDetailsByUserId(int userId);
	public List<Booking> getBookedEventDetailsByOrganizerId(int organizerId);
}
