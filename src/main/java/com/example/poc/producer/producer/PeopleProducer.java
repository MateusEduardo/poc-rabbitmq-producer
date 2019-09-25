package com.example.poc.producer.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.poc.producer.dto.PersonDTO;

@Component
public class PeopleProducer {

	private static final Logger logger = LoggerFactory.getLogger(PeopleProducer.class);

	private static final String EXCHANGE = "poc";
	private static final String ROUTINGKEY = "poc.person.create";

	@Autowired
	private AmqpTemplate amqpTemplate;

	public final void produce(PersonDTO personDTO) throws RuntimeException {
		try {
			amqpTemplate.convertAndSend(EXCHANGE, ROUTINGKEY, personDTO);
			logger.info("Send msg = " + personDTO.toString());
		} catch (RuntimeException ex) {
			logger.error(ex.toString());
		}

	}
}
