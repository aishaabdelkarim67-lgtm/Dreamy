
CREATE DATABASE IF NOT EXISTS dreamy_db;

USE dreamy_db;

-- 1. Brugere
CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255)
    );

-- 2. Ønskesedler

CREATE TABLE IF NOT EXISTS wishlist (
   id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    share_id VARCHAR(255),
    user_id BIGINT,

    FOREIGN KEY (user_id) REFERENCES users(id)
    );


-- 3. Ønsker
CREATE TABLE IF NOT EXISTS wish (
   id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    price DOUBLE,
    product_url VARCHAR(255),
    wishlist_id BIGINT,

    FOREIGN KEY (wishlist_id) REFERENCES wishlist(id)
    );
