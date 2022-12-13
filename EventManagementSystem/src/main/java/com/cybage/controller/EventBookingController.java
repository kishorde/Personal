package com.cybage.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;

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

import com.cybage.exception.RecordNotFoundException;
import com.cybage.model.AdminCategory;
import com.cybage.model.Event;
import com.cybage.model.EventBooking;
import com.cybage.service.AdminCategoryService;
import com.cybage.service.EventBookingService;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/eventBooking")
public class EventBookingController {


	@Autowired EventBookingService eventBookingService;
	
	@PostMapping("/addEventBooking")
	public ResponseEntity<String> addEventBooking(@RequestBody EventBooking eventBooking)
	{
		EventBooking eventBooking1 = eventBookingService.addEventBooking(eventBooking);
		return new ResponseEntity<String>("booking done Successfully!!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllEventBooking")
	public ResponseEntity<List<EventBooking>> getAllEventBooking()
	{
		List<EventBooking> bookingList = eventBookingService.getAllEventBooking();
		return new ResponseEntity<List<EventBooking>>(bookingList,HttpStatus.OK);
	}
	
	@GetMapping("/{bookingId}")
	public ResponseEntity<EventBooking> getEventBookingById(@PathVariable int bookingId)
	{
		EventBooking eventBooking1 = eventBookingService.getEventBookingById(bookingId);

		if(eventBooking1==null)
			throw new RecordNotFoundException("Booking not found!!");
		return new ResponseEntity<EventBooking>(eventBooking1,HttpStatus.OK);
	}
	
	@DeleteMapping("/{bookingId}")
	public ResponseEntity<String> deleteEventBooking(@PathVariable int bookingId)
	{
		eventBookingService.deleteEventBooking(bookingId);
		
		return new ResponseEntity<String>("Booking Deleted Successfully!",HttpStatus.CREATED);

	}
	
	@PutMapping("/{bookingId}")
	public ResponseEntity<String> updateEventBooking(@PathVariable int bookingId,@RequestBody EventBooking eventBooking)
	{
		eventBookingService.updateEventBooking(bookingId, eventBooking);
		return new ResponseEntity<String>("Booking updated Successfully!!!",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllEventBookingsByOrganizerId/{orgId}")
	public ResponseEntity<List<EventBooking>> getAllEventBookingsByOrganizerId(@PathVariable int orgId)
	{
//		List<EventBooking> eventBookingList = eventBookingService.getAllEventBookingsByOrganizerId(orgId);
		return new ResponseEntity<List<EventBooking>>(eventBookingService.getAllEventBookingsByOrganizerId(orgId),HttpStatus.OK);
	}
	
	@GetMapping("/getAllEventBookingsByUserId/{userId}")
	public ResponseEntity<List<EventBooking>> getAllEventBookingsByUserId(@PathVariable int userId)
	{
		List<EventBooking> eventBookingList = eventBookingService.getAllEventBookingsByUserId(userId);
		return new ResponseEntity<List<EventBooking>>(eventBookingList,HttpStatus.OK);
	}
	
	@GetMapping("/confirm/{bookingId}/{userId}")
	public ResponseEntity<String> confirmBooking(@PathVariable int bookingId,@PathVariable int userId) throws UnsupportedEncodingException, MessagingException
	{
		eventBookingService.confirmBooking(bookingId,userId);
		return new ResponseEntity<String>("Booking Confirmed Successfully!!!",HttpStatus.OK);
	}
	
	
	@GetMapping("/cancel/{bookingId}/{userId}")
	public ResponseEntity<String> cancelBooking(@PathVariable int bookingId,@PathVariable int userId) throws UnsupportedEncodingException, MessagingException
	{
		eventBookingService.cancelBooking(bookingId,userId);
		return new ResponseEntity<String>("Booking Cancelled Successfully!!!",HttpStatus.OK);
	}
	
	@GetMapping("/addFeedbackRating/{feedback}/{rating}/{bookingId}")
	public ResponseEntity<String> updatePassword(@PathVariable String feedback,@PathVariable int rating,@PathVariable int bookingId)
	{
		eventBookingService.updateFeedbackAndRating(feedback, rating, bookingId);
		return new ResponseEntity<String>("Feedback Added successfully.",HttpStatus.OK);
	}
	
}