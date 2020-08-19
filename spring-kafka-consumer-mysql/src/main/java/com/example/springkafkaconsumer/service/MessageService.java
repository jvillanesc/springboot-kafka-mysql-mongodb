package com.example.springkafkaconsumer.service;

import com.example.springkafkaconsumer.model.Hotel;
import com.example.springkafkaconsumer.repository.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Slf4j
@EnableBinding(Sink.class)
@Service
public class MessageService {

    @Autowired
    HotelRepository personRepository;

    @StreamListener(Sink.INPUT)
    public void read(Hotel person) {
        log.info("Consumer 1 " + person);
        personRepository.save(person);
    }

}
