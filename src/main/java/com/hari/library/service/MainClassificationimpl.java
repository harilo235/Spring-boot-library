package com.hari.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.library.entities.MainClassification;
import com.hari.library.repository.MainClassificationRepository;

@Service
public class MainClassificationimpl implements MainClassificationService {

	
	@Autowired
	MainClassificationRepository mclRepository;
	
	public void saveMCL(MainClassification mcl) {
		mclRepository.save(mcl);
	}

	@Override
	public MainClassification findMclById(long id) {
		return mclRepository.findById(id);
	}
	
	
	
}
