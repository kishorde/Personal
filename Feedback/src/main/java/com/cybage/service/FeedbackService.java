package com.cybage.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Feedback;
import com.cybage.repository.FeedbackRepository;


@Service
public class FeedbackService {

	@Autowired FeedbackRepository feedbackRepository;
	
	
	public Feedback addFeedback(Feedback feedback)
	{
		return feedbackRepository.save(feedback);
	}
	
	public List<Feedback> getAllFeedback()
	{
		return feedbackRepository.findAll();
	}
		
	public Feedback getFeedbackById(int feedbackId)
	{
		return feedbackRepository.findById(feedbackId).orElse(null);
	}

	public void deleteFeedback(int feedbackId) 
	{
		feedbackRepository.deleteById(feedbackId);
	}

	

}
