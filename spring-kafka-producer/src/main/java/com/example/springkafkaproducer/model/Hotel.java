package com.example.springkafkaproducer.model;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Hotel {

    private int id ;
    private String name;
    private int pricePerNight;

}
