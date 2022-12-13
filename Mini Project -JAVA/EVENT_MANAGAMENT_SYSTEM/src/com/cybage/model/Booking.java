package com.cybage.model;

public class Booking {
	
	int bookingId;
	int userId;
	int eventId;
	int organizerId;
	String status;
	
	public Booking()
	{
		
	}
	
	
	public Booking(int bookingId, int userId, int eventId, int organizerId, String status) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.eventId = eventId;
		this.organizerId = organizerId;
		this.status = status;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public int getOrganizerId() {
		return organizerId;
	}
	public void setOrganizerId(int organizerId) {
		this.organizerId = organizerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
