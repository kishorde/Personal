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

import com.cybage.model.EventBooking;
import com.cybage.model.EventOffer;
import com.cybage.service.EventOfferService;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/eventOffer")
public class EventOfferController {

	@Autowired EventOfferService eventOfferService;
	
	@PostMapping("/addEventOffer")
	public ResponseEntity<String> addEventOffer(@RequestBody EventOffer eventOffer)
	{
		EventOffer eventOffer1 = eventOfferService.addEventOffer(eventOffer);
		return new ResponseEntity<String>("EvendOffer Added Successfully!!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllEventOffers")
	public ResponseEntity<List<EventOffer>> getAllEventOffers()
	{
		List<EventOffer> eventOfferList = eventOfferService.getAllEventOffers();
		return new ResponseEntity<List<EventOffer>>(eventOfferList,HttpStatus.OK);
	}
	
	@GetMapping("/{eventOfferId}")
	public ResponseEntity<EventOffer> getEventOfferById(@PathVariable int eventOfferId)
	{
		EventOffer eventOffer1 = eventOfferService.getEventOfferById(eventOfferId);
		return new ResponseEntity<EventOffer>(eventOffer1,HttpStatus.OK);
	}
	
	@DeleteMapping("/{eventOfferId}")
	public ResponseEntity<String> deleteEventOffer(@PathVariable int eventOfferId)
	{
		eventOfferService.deleteEventOfferById(eventOfferId);
		return new ResponseEntity<String>("EvendOffer Deleted Successfully!",HttpStatus.CREATED);
	}
	
	@PutMapping("/{eventOfferId}")
	public ResponseEntity<String> updateEventOffer(@PathVariable int eventOfferId,@RequestBody EventOffer eventOffer)
	{
		eventOfferService.updateEventOffer(eventOfferId,eventOffer);
		return new ResponseEntity<String>("EvendOffer updated Successfully!!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllEventOfferByOrganizerId/{orgId}")
	public ResponseEntity<List<EventOffer>> getAllEventOfferByOrganizerId(@PathVariable int orgId)
	{
		return new ResponseEntity<List<EventOffer>>(eventOfferService.getAllEventOfferByOrganizerId(orgId),HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllEventOfferByEventId/{eventId}")
	public ResponseEntity<List<EventOffer>> getAllEventOfferByEventId(@PathVariable int eventId)
	{
		return new ResponseEntity<List<EventOffer>>(eventOfferService.getAllEventOfferByEventId(eventId),HttpStatus.OK);
	}
	
}
