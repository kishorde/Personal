package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cybage.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

	
	
}
