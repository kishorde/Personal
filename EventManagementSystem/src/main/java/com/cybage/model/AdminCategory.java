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
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="Category")
public class AdminCategory {

	@Id
	@GeneratedValue
	private int categoryId;
	
	private String categoryName;
	
	private String categoryImage;
	
	
	@OneToMany(mappedBy = "adminCategory", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Event> events;
}
