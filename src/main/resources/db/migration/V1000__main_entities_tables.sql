USE `webstore`;

CREATE TABLE IF NOT EXISTS `users` (
    id SERIAL PRIMARY KEY,
    name VARCHAR(45),
    surname VARCHAR(45),
    email VARCHAR(90),
    password VARCHAR(350),
    role VARCHAR(10) CHECK (role IN ('CUSTOMER', 'REDACTOR', 'ADMIN'))
    );

CREATE TABLE IF NOT EXISTS `product` (
    product_id SERIAL PRIMARY KEY,
    name VARCHAR(45),
    category VARCHAR(45),
    description VARCHAR(200),
    image VARCHAR(200),
    number INT,
    price INT
    );