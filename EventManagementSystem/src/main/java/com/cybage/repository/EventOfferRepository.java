package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.model.EventBooking;
import com.cybage.model.EventOffer;

@Repository
public interface EventOfferRepository extends JpaRepository<EventOffer, Integer>{

	@Query(value="select * from event_offer where organizer_id = ?1",nativeQuery=true)
	public List<EventOffer> findByEventOfferOrgId(int orgId);
	
	@Query(value="select * from event_offer where event_id = ?1",nativeQuery=true)
	public List<EventOffer> findEventOfferByEventId(int eventId);
	
	
}
