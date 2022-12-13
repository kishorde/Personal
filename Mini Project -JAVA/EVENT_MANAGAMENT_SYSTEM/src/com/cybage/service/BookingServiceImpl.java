package com.cybage.service;


import java.util.List;

import com.cybage.dao.BookingDAO;
import com.cybage.dao.BookingDAOImpl;
import com.cybage.model.Booking;

public class BookingServiceImpl implements BookingService {

	
	BookingDAO bookingdao = new BookingDAOImpl();
	
	public boolean BookEvent(Booking bookevent)
	{
		return bookingdao.BookEvent(bookevent);
	}
	
	
	public List<Booking> getBookedEventDetailsByUserId(int userId)
	{
		return bookingdao.getBookedEventDetailsByUserId(userId);
	}
	public List<Booking> getBookedEventDetailsByOrganizerId(int organizerId)
	{
		return bookingdao.getBookedEventDetailsByOrganizerId(organizerId);
	}
}
