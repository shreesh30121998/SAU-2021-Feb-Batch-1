package com.accolite.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.accolite.domain.LibraryEvent;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class LibraryEventProducer {

	@Autowired
	private KafkaTemplate<String, LibraryEvent> kafkaTemplate;

	public void sendLibraryEventAsynchronous(LibraryEvent libraryEvent) throws JsonProcessingException {
		kafkaTemplate.send("test-topic", libraryEvent);
	}

}
