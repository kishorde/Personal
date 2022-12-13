package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Event;
import com.cybage.service.EventService;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired EventService eventService;
	
	@PostMapping("/addEvent")
	public ResponseEntity<String> addEvent(@RequestBody Event event)
	{
		Event event1 = eventService.addEvent(event);
		return new ResponseEntity<String>("Evend Added Successfully!!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllEvents")
	public ResponseEntity<List<Event>> getAllEvents()
	{
		List<Event> eventList = eventService.getAllEvents();
		return new ResponseEntity<List<Event>>(eventList,HttpStatus.OK);
	}
	
	@GetMapping("/{eventId}")
	public ResponseEntity<Event> getEventById(@PathVariable int eventId)
	{
		Event event1 = eventService.getEventById(eventId);
		return new ResponseEntity<Event>(event1,HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/{eventId}")
	public ResponseEntity<String> deleteEvent(@PathVariable int eventId)
	{
		eventService.deleteEventById(eventId);
		return new ResponseEntity<String>("Event Deleted Successfully!",HttpStatus.CREATED);
	}
	
	@PutMapping("/{eventId}")
	public ResponseEntity<String> updateEvent(@PathVariable int eventId,@RequestBody Event event)
	{
		eventService.updateEvent(eventId,event);
		return new ResponseEntity<String>("Event updated Successfully!!!",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllEventsByOrganizerId/{orgId}")
	public ResponseEntity<List<Event>> getAllEventsByOrganizerId(@PathVariable int orgId)
	{
		List<Event> eventList = eventService.getAllEventsByOrganizerId(orgId);
		return new ResponseEntity<List<Event>>(eventService.getAllEventsByOrganizerId(orgId),HttpStatus.OK);
	}
	
	@GetMapping("/averageRating/{eventId}/{eventId1}")
	public ResponseEntity<String> updatePassword(@PathVariable int eventId,@PathVariable int eventId1)
	{
		eventService.ratingAverage(eventId,eventId1);
		return new ResponseEntity<String>("averageRating successfully.",HttpStatus.OK);
	}
	
	
	

}
