package com.hari.library.service;

import javax.validation.Valid;

import com.hari.library.entities.MainClassification;

public interface MainClassificationService {
	
	void saveMCL(@Valid MainClassification mcl); //save mcl
	MainClassification findMclById(long id); //find by id
}
