package com.example.springkafkaconsumer.repository;


import com.example.springkafkaconsumer.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {

}
