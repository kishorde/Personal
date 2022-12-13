package com.cybage.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.cybage.repository.EventRepository;

@ExtendWith(MockitoExtension.class)
public class EventServiceTest {

	@Mock
	private EventRepository eventRepository;
	
	@Autowired
	private EventService eventService;
	
	@BeforeEach
	void setup() {
		this.eventService=new EventService(this.eventRepository);
	}
	
	@Test
	void getAllEvent()
	{
		eventService.getAllEvents();
		verify(eventRepository).findAll();
	}
}
