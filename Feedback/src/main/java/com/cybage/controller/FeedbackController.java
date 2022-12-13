package com.cybage.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.RecordNotFoundException;
import com.cybage.model.Feedback;
import com.cybage.repository.FeedbackRepository;
import com.cybage.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	/*
	 * @Autowired private FeedbackRepository feedbackRepository;
	 */
	@Autowired 
	private FeedbackService feedbackService;
	
	
	@PostMapping("/addFeedback")
	public ResponseEntity<String> addFeedback(@RequestBody Feedback feedback)
	{
		Feedback feedback1 = feedbackService.addFeedback(feedback);
		return new ResponseEntity<String>("Feedback Added Successfully!!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllFeedback")
	public ResponseEntity<List<Feedback>> getAllfeedback()
	{
		List<Feedback> feedbackList = feedbackService.getAllFeedback();
		return new ResponseEntity<List<Feedback>>(feedbackList,HttpStatus.OK);
	}
	
	@GetMapping("/{feedbackId}")
	public ResponseEntity<Feedback> getFeedbackById(@PathVariable int feedbackId)
	{
		Feedback feedback1 = feedbackService.getFeedbackById(feedbackId);

		if(feedback1==null)
			throw new RecordNotFoundException("Feedback not found!!");
		return new ResponseEntity<Feedback>(feedback1,HttpStatus.OK);
	}
	
	@DeleteMapping("/{feedbackId}")
	public ResponseEntity<String> deleteFeedback(@PathVariable int feedbackId)
	{
		feedbackService.deleteFeedback(feedbackId);
		return new ResponseEntity<String>("Feedback Deleted Successfully!",HttpStatus.CREATED);
	}
	
}
