USE `webstore`;

CREATE TABLE IF NOT EXISTS `users` (
                                       `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
                                       `name` VARCHAR(45) NOT NULL,
                                       `surname` VARCHAR(45) NOT NULL,
                                       `email` VARCHAR(90) NOT NULL,
                                       `password` VARCHAR(350) NOT NULL,
                                       `role` ENUM('CUSTOMER', 'REDACTOR', 'ADMIN') NOT NULL,
                                       PRIMARY KEY (`id`),
                                       CHECK (`role` IN ('CUSTOMER', 'REDACTOR', 'ADMIN'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE IF NOT EXISTS product (
                                       product_id INTEGER AUTO_INCREMENT PRIMARY KEY,
                                       name VARCHAR(45),
                                       category VARCHAR(45),
                                       description VARCHAR(200),
                                       image VARCHAR(200),
                                       number INT,
                                       price INT
);
