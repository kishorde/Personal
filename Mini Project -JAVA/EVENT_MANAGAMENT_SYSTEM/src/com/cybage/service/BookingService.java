package com.cybage.service;



import java.util.List;

import com.cybage.model.Booking;

public interface BookingService {

	public boolean BookEvent(Booking bookevent);
	
	public List<Booking> getBookedEventDetailsByUserId(int userId);
	public List<Booking> getBookedEventDetailsByOrganizerId(int organizerId);
}
