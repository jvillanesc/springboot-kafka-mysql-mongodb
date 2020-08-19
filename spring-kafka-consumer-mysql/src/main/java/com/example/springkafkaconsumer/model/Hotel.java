package com.example.springkafkaconsumer.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "hotels")
public class Hotel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column
    private String name;
    @Column
    private int pricePerNight;

}
