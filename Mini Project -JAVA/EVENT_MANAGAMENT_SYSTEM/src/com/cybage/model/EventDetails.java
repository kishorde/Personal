package com.cybage.model;

public class EventDetails {

	
	int eventId;
	String eventName;
	String eventCategory;
	String eventCity;
	String eventDate;
	int eventPrice;
	int categoryId;
	int eventOrganizerId;
	String approvalStatus; 
	String eventOrganizerEmail;
	
	
	

	public EventDetails(int eventId, String eventName, String eventCategory, String eventCity, String eventDate,
			int eventPrice, int categoryId, int eventOrganizerId, String approvalStatus, String eventOrganizerEmail) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventCategory = eventCategory;
		this.eventCity = eventCity;
		this.eventDate = eventDate;
		this.eventPrice = eventPrice;
		this.categoryId = categoryId;
		this.eventOrganizerId = eventOrganizerId;
		this.approvalStatus = approvalStatus;
		this.eventOrganizerEmail = eventOrganizerEmail;
	}



	public EventDetails() {
		
		
	}

	

	public int getEventId() {
		return eventId;
	}



	public void setEventId(int eventId) {
		this.eventId = eventId;
	}



	public String getEventName() {
		return eventName;
	}



	public void setEventName(String eventName) {
		this.eventName = eventName;
	}



	public String getEventCategory() {
		return eventCategory;
	}



	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}



	public String getEventCity() {
		return eventCity;
	}



	public void setEventCity(String eventCity) {
		this.eventCity = eventCity;
	}



	public String getEventDate() {
		return eventDate;
	}



	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}



	public int getEventPrice() {
		return eventPrice;
	}



	public void setEventPrice(int eventPrice) {
		this.eventPrice = eventPrice;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public int getEventOrganizerId() {
		return eventOrganizerId;
	}



	public void setEventOrganizerId(int eventOrganizerId) {
		this.eventOrganizerId = eventOrganizerId;
	}



	public String getApprovalStatus() {
		return approvalStatus;
	}



	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}



	public String getEventOrganizerEmail() {
		return eventOrganizerEmail;
	}



	public void setEventOrganizerEmail(String eventOrganizerEmail) {
		this.eventOrganizerEmail = eventOrganizerEmail;
	}
	
	



	
	

	

	
	
	
	
	
	
	
	
}
