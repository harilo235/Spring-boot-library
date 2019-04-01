package com.hari.library.service;

import javax.validation.Valid;

import com.hari.library.entities.SubClassification;

public interface SubClassificationService {

	void saveSCL(@Valid SubClassification scl); // save scl 
}
