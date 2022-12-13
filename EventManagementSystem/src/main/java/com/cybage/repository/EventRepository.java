package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.model.Event;


@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{

	@Query(value="select * from Event where organizer_id = ?1",nativeQuery=true)
	public List<Event> findByOrgId(int id);
	
	@Query(value="update event set rating=(SELECT AVG(rating) FROM event_booking WHERE event_id = ?1) where event_id=?2",nativeQuery=true)
	public Event ratingAverage(int eventid,int eventid1);
	
}
