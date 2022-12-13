package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Event;
import com.cybage.model.EventBooking;
import com.cybage.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired EventRepository eventRepository;
	
	
	public EventService(EventRepository eventRepository2) 
	{
		this.eventRepository=eventRepository2;
	}

	//	public Event addEvent(Event event,int orgId)
//	{
//		return eventRepository.save(event);
//	}
//	
	public Event addEvent(Event event)
	{
		return eventRepository.save(event);
	}
	
	public List<Event> getAllEvents()
	{
		return eventRepository.findAll();
	}
		
	public Event getEventById(int eventId)
	{
		return eventRepository.findById(eventId).orElse(null);
	}

	public void deleteEventById(int eventId) 
	{
		eventRepository.deleteById(eventId);
	}
	
	public Event updateEvent(int eventId,Event event)
	{
		Event event1=eventRepository.findById(eventId).get();
//		if(event.getEventCategoryName()!=null)
//			event1.setEventCategoryName(event.getEventCategoryName());
		
		if(event.getEventCity()!=null)
			event1.setEventCity(event.getEventCity());
		
		if(event.getEventDate()!=null)
			event1.setEventDate(event.getEventDate());
		
		if(event.getEventDescription()!=null)
			event1.setEventDescription(event.getEventDescription());
		
		if(event.getEventName()!=null)
			event1.setEventName(event.getEventName());
		
		if(event.getEventImage()!=null)
			event1.setEventImage(event.getEventImage());

		if(event.getEventPrice()!=0)
			event1.setEventPrice(event.getEventPrice());
		
		return eventRepository.save(event1);
	}
	
	
	
	
	public List<Event> getAllEventsByOrganizerId(int orgId)
	{
		return eventRepository.findByOrgId(orgId);
	}
	
	public Event ratingAverage(int eventId,int eventId1)
	{
		Event event = eventRepository.findById(eventId).get();
		return eventRepository.save(event);
	}
	
}
