package com.hari.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.library.entities.SubClassification;

public interface SubClassificationRepository extends JpaRepository <SubClassification, String> {

}
