USE webstore;

CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(45),
    surname VARCHAR(45),
    email VARCHAR(90),
    password VARCHAR(350),
    role VARCHAR(10) CHECK (role IN ('CUSTOMER', 'REDACTOR', 'ADMIN'))
    );

CREATE TABLE IF NOT EXISTS product (
    product_id SERIAL PRIMARY KEY,
    name VARCHAR(45),
    description VARCHAR(200),
    number INT,
    price INT
    );

CREATE TABLE IF NOT EXISTS store (
    store_id SERIAL PRIMARY KEY,
    name VARCHAR(45),
    location VARCHAR(150)
    );

CREATE TABLE IF NOT EXISTS stock (
    stock_id SERIAL PRIMARY KEY,
    location VARCHAR(150)
    );