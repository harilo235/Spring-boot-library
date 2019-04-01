package com.hari.library.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(schema = "library" , name= "subClassification")
public class SubClassification implements Serializable {
	
	@Id
	private String subClassId;
	private String subClassName;
	
	@ManyToOne
	@JoinColumn(name = "mainClassId", nullable = false)
	@JsonIgnore
	MainClassification mainClassification;

	public String getSubClassId() {
		return subClassId;
	}

	public void setSubClassId(String subClassId) {
		this.subClassId = subClassId;
	}

	public String getSubClassName() {
		return subClassName;
	}

	public void setSubClassName(String subClassName) {
		this.subClassName = subClassName;
	}

	public MainClassification getMainClassification() {
		return mainClassification;
	}

	public void setMainClassification(MainClassification mainClassification) {
		this.mainClassification = mainClassification;
	}
	
	
	

}
