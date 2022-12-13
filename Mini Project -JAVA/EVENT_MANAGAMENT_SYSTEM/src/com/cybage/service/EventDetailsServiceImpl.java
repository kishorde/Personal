package com.cybage.service;

import java.util.List;

import com.cybage.dao.EventDetailsDAO;
import com.cybage.dao.EventDetailsDAOImpl;
import com.cybage.model.EventDetails;

public class EventDetailsServiceImpl implements EventDetailsService{
	
	private EventDetailsDAO eventdetailsdao=new EventDetailsDAOImpl();
	
	public boolean addEvent(EventDetails eventdetails)
	{
		return eventdetailsdao.addEvent(eventdetails);
		
	}



	
	public List<EventDetails> getEventDetailsById(int eventId)
	{
		return	eventdetailsdao.getEventDetailsById(eventId);
	}
	
	public boolean deleteEventDetails(int eventId)
	{
		return eventdetailsdao.deleteEventDetails(eventId);
	}
	
	public boolean updateEventDetails(EventDetails eventdetails)
	{
		return eventdetailsdao.updateEventDetails(eventdetails);
	}
	
	
	
	public EventDetails getEventByIdForUpdate(int eventId)
	{
		return eventdetailsdao.getEventByIdForUpdate(eventId);
	}
	
	
	public List<EventDetails> getAllEventList()
	{
		return eventdetailsdao.getAllEventList();
	}
}
