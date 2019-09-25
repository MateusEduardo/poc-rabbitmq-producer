package com.example.poc.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.poc.producer.dto.PersonDTO;
import com.example.poc.producer.service.ProducerService;

@RestController
@RequestMapping(value = "/api/v1/producer")
public class ProducerController {

	@Autowired
	private ProducerService producerService;
	
	@PostMapping(value = "/test")
	public ResponseEntity<PersonDTO> sendMessage(@RequestBody PersonDTO peopleDTO) {
		return producerService.sendMessage(peopleDTO);
	}
}
