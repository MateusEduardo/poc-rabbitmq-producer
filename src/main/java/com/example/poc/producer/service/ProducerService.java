package com.example.poc.producer.service;

import org.springframework.http.ResponseEntity;

import com.example.poc.producer.dto.PersonDTO;

public interface ProducerService {

	ResponseEntity<PersonDTO> sendMessage(PersonDTO peopleDTO);
}
