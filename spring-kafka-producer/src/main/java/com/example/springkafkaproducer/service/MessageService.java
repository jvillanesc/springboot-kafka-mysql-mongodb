package com.example.springkafkaproducer.service;

import com.example.springkafkaproducer.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@EnableBinding(Source.class)
@Service
public class MessageService {

    @Autowired
    private Source source;

    @SendTo
    public boolean send(Hotel person){
        return source.output().send(MessageBuilder.withPayload(person).build());
    }

}
