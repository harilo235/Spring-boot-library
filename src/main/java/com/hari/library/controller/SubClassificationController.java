package com.hari.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hari.library.entities.SubClassification;
import com.hari.library.service.SubClassificationService;

@RestController
public class SubClassificationController {

	@Autowired
	SubClassificationService subClassService;
	
	@PostMapping("/savesubclass")
	public HttpStatus createSubClass(@Valid @RequestBody SubClassification subCl )
	{
		subClassService.saveSCL(subCl);
		return HttpStatus.CREATED;
	}
	
}
