package com.cybage.dao;

import java.util.List;

import com.cybage.model.EventDetails;

public interface EventDetailsDAO {

	public boolean addEvent(EventDetails eventdetails);
	public List<EventDetails> getAllEventDetails(int OrganizerId);
	public EventDetails getEventDetailsById(int eventId);
	public boolean deleteEventDetails(int eventId);
	public boolean updateEventDetails(EventDetails eventdetails);
	
	
	
}
