package com.cybage.model;

public class OrganizerEventDetails {
	
	int eventId;
	String eventName;
	String eventCategoryName;
	String eventCity;
	String eventDate;
	int eventPrice;
	String eventOrganizerName;
	String eventOrganizerEmail;
	int eventCategoryId;
	int eventOrganizerId;
	String approvalStatus;
	
	public OrganizerEventDetails()
	{
		
	}
		
	public OrganizerEventDetails(int eventId, String eventName, String eventCategoryName, String eventCity,
			String eventDate, int eventPrice, String eventOrganizerName, String eventOrganizerEmail,
			int eventCategoryId, int eventOrganizerId, String approvalStatus) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventCategoryName = eventCategoryName;
		this.eventCity = eventCity;
		this.eventDate = eventDate;
		this.eventPrice = eventPrice;
		this.eventOrganizerName = eventOrganizerName;
		this.eventOrganizerEmail = eventOrganizerEmail;
		this.eventCategoryId = eventCategoryId;
		this.eventOrganizerId = eventOrganizerId;
		this.approvalStatus = approvalStatus;
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
	public String getEventCategoryName() {
		return eventCategoryName;
	}
	public void setEventCategoryName(String eventCategoryName) {
		this.eventCategoryName = eventCategoryName;
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
	public String getEventOrganizerName() {
		return eventOrganizerName;
	}
	public void setEventOrganizerName(String eventOrganizerName) {
		this.eventOrganizerName = eventOrganizerName;
	}
	public String getEventOrganizerEmail() {
		return eventOrganizerEmail;
	}
	public void setEventOrganizerEmail(String eventOrganizerEmail) {
		this.eventOrganizerEmail = eventOrganizerEmail;
	}
	public int getEventCategoryId() {
		return eventCategoryId;
	}
	public void setEventCategoryId(int eventCategoryId) {
		this.eventCategoryId = eventCategoryId;
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
	
	
}
