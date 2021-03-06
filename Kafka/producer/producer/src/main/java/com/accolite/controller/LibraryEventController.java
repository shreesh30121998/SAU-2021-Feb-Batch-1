package com.accolite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.domain.LibraryEvent;
import com.accolite.producer.LibraryEventProducer;
import com.fasterxml.jackson.core.JsonProcessingException;


@RestController
public class LibraryEventController {
	
	@Autowired
	private LibraryEventProducer libraryEventProducer;
	
	@PostMapping("/v1/libraryEvent")
	public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent)
			throws JsonProcessingException {

		libraryEventProducer.sendLibraryEventAsynchronous(libraryEvent);

		return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
	}
	

}
