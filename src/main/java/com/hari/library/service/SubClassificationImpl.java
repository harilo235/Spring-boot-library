package com.hari.library.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.library.entities.SubClassification;
import com.hari.library.repository.SubClassificationRepository;

@Service
public class SubClassificationImpl implements SubClassificationService  {

	@Autowired
	SubClassificationRepository sclRepository;

	@Override
	public void saveSCL(@Valid SubClassification scl) {
		sclRepository.save(scl);
	}
	
	
}
