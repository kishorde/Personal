package com.cybage.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "event")
public class Event {

	@Id
	@GeneratedValue
	private int eventId;
	private String eventName;
//	private String eventOrganizerId;
	private Date eventDate;
	private int eventPrice;
	private String eventCity;
	private String eventDescription;
	private String eventImage;
	
	private float rating; 

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = { "event", "hibernateLazyInitializer" })
	@JoinColumn(name = "categoryId")
	private AdminCategory adminCategory;

	// eventoffer
	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<EventOffer> eventOffer;

	// regid
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = { "event", "hibernateLazyInitializer" })
	@JoinColumn(name = "organizerId")
	private UserBean organizer;

	// eventbooking
	@OneToMany(mappedBy = "events", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<EventBooking> eventBooking;

	// userReport
	@OneToMany(mappedBy = "eventReport", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Event> eventReport;
	

}
