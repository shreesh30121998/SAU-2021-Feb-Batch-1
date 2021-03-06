package com.accolite.listener;

import java.util.List;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.accolite.domain.LibraryEvent;

@EnableKafka
@Service
public class KafkaListener {
	
	@org.springframework.kafka.annotation.KafkaListener(id="kafka_group_one",topics="test-topic")
	public void processMessage(@Payload List<LibraryEvent> libraryEvents,
			@Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
			@Header(KafkaHeaders.OFFSET) List<Long> offset) {
		System.out.println(libraryEvents.get(0));
	}

}
