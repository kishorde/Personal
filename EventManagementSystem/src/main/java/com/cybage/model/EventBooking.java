package com.cybage.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table()
public class EventBooking {

	@Id
	@GeneratedValue
	private int eventBookingId;
	
	private int noOfTickets;
	private int couponDiscount;
	
	private String status="pending";
	private String eventFeedback="-";
	
	private int rating=5;
	
//	user
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = {"eventBooking", "hibernateLazyInitializer"})
	@JoinColumn(name="userId")
	private UserBean userBooking;
	
//	org
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = {"eventBooking", "hibernateLazyInitializer"})
	@JoinColumn(name="organizerId")
	private UserBean organizerBooking;
	
	//booking
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = {"eventBooking", "hibernateLazyInitializer"})
	@JoinColumn(name="eventId")
	private Event events;
	
	
}
