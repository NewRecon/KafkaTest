package com.example.testkafka.controllers;

import com.example.testkafka.kafka.JsonKafkaProducer;
import com.example.testkafka.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class JsomMessageController {
    private final JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/json")
    public User send(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return user;
    }
}
