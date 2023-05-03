INSERT INTO users (name, surname, email, password, role)
VALUES ('John', 'Doe', 'customer@example.com', '$2a$10$BG88S4JNCulnnZ1z3/HdAO4Yw4kvDlkxCk41EHVZ9zmcXdH7VtkKy', 'CUSTOMER'),
       ('Jane', 'Doe', 'redactor@example.com', '$2a$10$7VHzpL6o0PcNzXZjS8ZlROgnKr7cNl3qJy/W4fYIZDK/4UK/TFa76', 'REDACTOR'),
       ('Bob', 'Smith', 'admin@example.com', '$2a$10$zQe01K6yws7VU5L6u5HcLuMvZosSMgW8dA.CpOxJ0o98ddxdGwW8O', 'ADMIN');

INSERT INTO product (name, description) VALUES
                                            ('iPhone 13 Pro Max', 'The latest iPhone model with a 6.7 inch Super Retina XDR display.'),
                                            ('Samsung Galaxy S22', 'A high-end Android smartphone with a 6.2 inch Dynamic AMOLED display.'),
                                            ('MacBook Pro 16-inch', 'A powerful laptop with a 16 inch Retina display and M1 Pro chip.'),
                                            ('Sony Bravia OLED TV', 'A premium TV with a 55 inch OLED display and 4K HDR resolution.'),
                                            ('Bose QuietComfort 45', 'Wireless noise-cancelling headphones with up to 24 hours of battery life.'),
                                            ('Canon EOS R6', 'A mirrorless camera with a 20.1 megapixel full-frame sensor and 4K video recording.'),
                                            ('Nintendo Switch OLED', 'The latest version of the popular gaming console with a 7 inch OLED display.'),
                                            ('Apple Watch Series 7', 'The newest smartwatch from Apple with an always-on Retina display.'),
                                            ('Dyson V15 Detect', 'A powerful cordless vacuum cleaner with advanced laser technology.'),
                                            ('Nespresso Vertuo', 'A coffee machine that uses Nespresso capsules to make a variety of coffee styles.');

INSERT INTO store (name, location) VALUES
                                       ('Best Buy', 'New York City'),
                                       ('Target', 'Los Angeles'),
                                       ('Walmart', 'Chicago'),
                                       ('Amazon', 'Seattle');

INSERT INTO stock (location) VALUES
                                 ('New York City'),
                                 ('Los Angeles'),
                                 ('Chicago'),
                                 ('Seattle');