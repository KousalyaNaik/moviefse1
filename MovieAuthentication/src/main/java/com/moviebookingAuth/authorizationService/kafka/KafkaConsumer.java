package com.moviebookingAuth.authorizationService.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "addnewmovie-topic", groupId = "auth-group")
    public void receiveMovieMessage(String Message) {
        System.out.println("From Auth I can See that : " +Message+" movie is added");
    }
}