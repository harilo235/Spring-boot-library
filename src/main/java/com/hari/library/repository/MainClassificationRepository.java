package com.hari.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.library.entities.MainClassification;

public interface MainClassificationRepository extends JpaRepository <MainClassification, Long>{
	MainClassification findById(long id); // override default getone function
}
