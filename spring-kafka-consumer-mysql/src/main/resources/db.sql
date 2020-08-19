CREATE DATABASE db_hotels;
USE db_hotels;
CREATE TABLE hotels(
    id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    price_per_night INT(11)
);