package com.cybage.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name= "feedback")
public class Feedback {
	
	@Id
	@GeneratedValue
	private int feedbackId;
	
	@Column	
	private String userName;
	
	@Column	
	private String role;
	
	
	@Column	
	private String comment; 

}
