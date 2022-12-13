package com.cybage.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name ="registration")
@Entity
public class UserBean {

	@Id
	@GeneratedValue
	private int userId;

	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String address;
	private String userRole;
	private String contactNo;
	private String profilePhoto;
	
	private String oneTimePassword;
	
	private int attempt;
	private boolean accountLockedStatus;

	@Column(length = 30)
	private String authenticationCode;
	private Boolean enable;
	
	//event
	@OneToMany(mappedBy = "organizer", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Event> events;
	
	//eventoffer
	@OneToMany(mappedBy = "organizerOffer", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<EventOffer> organizerOffer;
	
	
	//eventbooking 
	@OneToMany(mappedBy = "userBooking",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<EventBooking> userEventBooking;
	
	//orgbooking
	@OneToMany(mappedBy = "organizerBooking", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<EventBooking> organizerEventBooking;
	
	//userReport
	@OneToMany(mappedBy = "userReport",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<UserReports> userReport ;
	
	
	//userLog
	@OneToMany(mappedBy = "userLog",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<UserLogs> userLog;

	public boolean isEnable() {
		return enable;
	}
}
