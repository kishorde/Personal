package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.EventBooking;
import com.cybage.model.EventOffer;
import com.cybage.repository.EventOfferRepository;

@Service
public class EventOfferService {

@Autowired EventOfferRepository eventOfferRepository;
	
	public EventOffer addEventOffer(EventOffer eventOffer)
	{
		return eventOfferRepository.save(eventOffer);
	}
	
	public List<EventOffer> getAllEventOffers()
	{
		return eventOfferRepository.findAll();
	}
		
	public EventOffer getEventOfferById(int eventOfferId)
	{
		return eventOfferRepository.findById(eventOfferId).orElse(null);
	}

	public void deleteEventOfferById(int eventOfferId) 
	{
		eventOfferRepository.deleteById(eventOfferId);
	}
	
	public EventOffer updateEventOffer(int eventOfferId,EventOffer eventOffer)
	{
		EventOffer eventOffer1=eventOfferRepository.findById(eventOfferId).get();
		if(eventOffer.getEventOfferDiscount()!=0)
			eventOffer1.setEventOfferDiscount(eventOffer.getEventOfferDiscount());
		
		if(eventOffer.getEventCouponCode()!=null)
			eventOffer1.setEventCouponCode(eventOffer.getEventCouponCode());
		
		return eventOfferRepository.save(eventOffer1);
	}
	
	public List<EventOffer> getAllEventOfferByOrganizerId(int orgId)
	{
		return eventOfferRepository.findByEventOfferOrgId(orgId);
	}
	
	
	
	public List<EventOffer> getAllEventOfferByEventId(int eventId) {
		return eventOfferRepository.findEventOfferByEventId(eventId);
	}
	
	
	
	
}
