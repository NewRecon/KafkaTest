package com.example.testkafka.controllers;

import com.example.testkafka.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public String publish (@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return "Message sends";
    }
}
