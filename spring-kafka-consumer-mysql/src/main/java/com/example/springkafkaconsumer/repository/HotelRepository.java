package com.example.springkafkaconsumer.repository;


import com.example.springkafkaconsumer.model.Hotel;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

public interface HotelRepository extends Repository<Hotel, Serializable> {

    List<Hotel> findAll();
    Hotel findById(int id);
    Hotel save(Hotel person);
    void delete(Hotel person);

}
