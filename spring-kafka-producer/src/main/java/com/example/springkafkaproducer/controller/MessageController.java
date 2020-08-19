package com.example.springkafkaproducer.controller;

import com.example.springkafkaproducer.model.Hotel;
import com.example.springkafkaproducer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public void send(@RequestBody Hotel hotel){
        messageService.send(hotel);
    }
}
