package com.cybage.model;


import java.sql.Date;

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
@Table
public class UserLogs {
	
	@Id
	@GeneratedValue
	private int userLogId;
	
	
	private Date loggedDate;
	
	//user
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = {"UserLogs", "hibernateLazyInitializer"})
	@JoinColumn(name="userId")
	private UserBean userLog;
	

}
