package com.cybage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
public class EventOffer {
	
	@Id
	@GeneratedValue
	private int eventOfferId;
	
	//foreignkey
	
//	private int eventId;
	
	private int eventOfferDiscount;
	
	private String eventCouponCode;
	
	//event
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = {"EventOffer", "hibernateLazyInitializer"})
	@JoinColumn(name="eventId")
	private Event event;
	
//	org
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = {"EventOffer", "hibernateLazyInitializer"})
	@JoinColumn(name="organizerId")
	private UserBean organizerOffer;
}
