package com.hari.library.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(schema = "library" , name= "mainClassification")
public class MainClassification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long mainClassId;
	String mainClassName;
	
	@JsonBackReference
	@OneToMany(mappedBy = "mainClassification", cascade = {CascadeType.ALL})
	private List<SubClassification> subClassification;
	
	public Long getMainClassId() {
		return mainClassId;
	}
	public void setMainClassId(Long mainClassId) {
		this.mainClassId = mainClassId;
	}
	public String getMainClassName() {
		return mainClassName;
	}
	public void setMainClassName(String mainClassName) {
		this.mainClassName = mainClassName;
	}
	public List<SubClassification> getSubClassification() {
		return subClassification;
	}
	public void setSubClassification(List<SubClassification> subClassification) {
		this.subClassification = subClassification;
	}
	
	

}
