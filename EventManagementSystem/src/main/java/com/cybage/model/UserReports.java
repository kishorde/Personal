package com.cybage.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Entity
@Table(name="userReports")
public class UserReports {

	@Id
	@GeneratedValue
	private int userReportId;
	
	//user
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = {"userReports", "hibernateLazyInitializer"})
	@JoinColumn(name="userId")
	private UserBean userReport;
	
	//event
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = { "userReports", "hibernateLazyInitializer" })
	@JoinColumn(name = "eventId")
	private Event eventReport;
}
