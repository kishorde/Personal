package com.cybage.service;

import java.util.List;

import com.cybage.model.EventDetails;

public interface EventDetailsService {
	
	public boolean addEvent(EventDetails eventdetails);
	public List<EventDetails> getEventDetailsById(int eventId);
	public boolean deleteEventDetails(int eventId);
	boolean updateEventDetails(EventDetails eventdetails);
	
	public EventDetails getEventByIdForUpdate(int eventId);
	public List<EventDetails> getAllEventList();

}
