package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cybage.model.Feedback;
import com.cybage.model.UserBean;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/feedbackapi")
public class FeedbackController {


	//rest- template

	@Autowired
	private RestTemplate restTemplate;
	
	private String baseUrl="http://localhost:8081/feedback";
	
	@PostMapping("/addFeedback")
	public ResponseEntity<String> addFeedback(@RequestBody Feedback feedback)
	{
		return restTemplate.postForEntity(baseUrl+"/addFeedback",feedback,String.class);
	}
	
	
	@GetMapping("/getAllFeedback")
	public ResponseEntity<Feedback[]> getAllFeedback()
	{
		return restTemplate.getForEntity(baseUrl + "/getAllFeedback", Feedback[].class);
	}
	
	@GetMapping("/getFeedbackById/{id}")
	public ResponseEntity<Feedback> getFeedbackById(@PathVariable int id)
	{
		return restTemplate.getForEntity(baseUrl + "/"+id, Feedback.class);
	} 
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFeedback(@PathVariable int id)
	{
		restTemplate.delete(baseUrl + "/"+id, String.class);
		return new ResponseEntity<String>("Feedback Deleted Successfully!",HttpStatus.CREATED);
	}
}
