package com.moviebookingApp.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private static final String TOPIC = "addnewmovie-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMovieMessage(String Message) {
        kafkaTemplate.send(TOPIC, Message);
    }
}