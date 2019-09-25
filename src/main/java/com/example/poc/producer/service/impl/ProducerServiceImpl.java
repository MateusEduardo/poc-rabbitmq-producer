package com.example.poc.producer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.poc.producer.dto.PersonDTO;
import com.example.poc.producer.producer.PeopleProducer;
import com.example.poc.producer.service.ProducerService;

@Service
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private PeopleProducer producer;
	
	@Override
	public ResponseEntity<PersonDTO> sendMessage(PersonDTO personDTO) {
		try {
			producer.produce(personDTO);
			return ResponseEntity.ok().build();
		} catch(RuntimeException ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
