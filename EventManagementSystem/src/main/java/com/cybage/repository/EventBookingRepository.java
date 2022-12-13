package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.model.EventBooking;
import com.cybage.model.UserBean;

@Repository
public interface EventBookingRepository extends JpaRepository<EventBooking, Integer>{

	@Query(value="select * from event_booking where organizer_id = ?1",nativeQuery=true)
	public List<EventBooking> findBookingByOrgId(int id);
	
	
	@Query(value="select * from event_booking where user_id = ?1",nativeQuery=true)
	public List<EventBooking> findBookingByUserId(int id);
	
	@Query(value="update event_booking set event_feedback = ?1 , rating = ?2  WHERE event_booking_id = ?3;",nativeQuery=true)
	public EventBooking updateFeedbackAndRating(String feedback,int rating,int bookingid);
	
}
