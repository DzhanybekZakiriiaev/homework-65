INSERT INTO users (name, surname, email, password, role)
VALUES ('John', 'Doe', 'customer@example.com', '$2a$10$BG88S4JNCulnnZ1z3/HdAO4Yw4kvDlkxCk41EHVZ9zmcXdH7VtkKy', 'CUSTOMER'),
       ('Jane', 'Doe', 'redactor@example.com', '$2a$10$7VHzpL6o0PcNzXZjS8ZlROgnKr7cNl3qJy/W4fYIZDK/4UK/TFa76', 'REDACTOR'),
       ('Bob', 'Smith', 'admin@example.com', '$2a$10$zQe01K6yws7VU5L6u5HcLuMvZosSMgW8dA.CpOxJ0o98ddxdGwW8O', 'ADMIN');

INSERT INTO product (name, description, number, price, image) VALUES
                                            ('iPhone 13 Pro Max', 'The latest iPhone model with a 6.7 inch Super Retina XDR display.', 20, 1500, ''),
                                            ('Samsung Galaxy S22', 'A high-end Android smartphone with a 6.2 inch Dynamic AMOLED display.', 56, 1234, ''),
                                            ('MacBook Pro 16-inch', 'A powerful laptop with a 16 inch Retina display and M1 Pro chip.', 45, 2350, ''),
                                            ('Sony Bravia OLED TV', 'A premium TV with a 55 inch OLED display and 4K HDR resolution.', 35, 560, ''),
                                            ('Bose QuietComfort 45', 'Wireless noise-cancelling headphones with up to 24 hours of battery life.', 29, 345, ''),
                                            ('Canon EOS R6', 'A mirrorless camera with a 20.1 megapixel full-frame sensor and 4K video recording.', 12,850, ''),
                                            ('Nintendo Switch OLED', 'The latest version of the popular gaming console with a 7 inch OLED display.', 45, 340, ''),
                                            ('Apple Watch Series 7', 'The newest smartwatch from Apple with an always-on Retina display.', 100, 590, ''),
                                            ('Dyson V15 Detect', 'A powerful cordless vacuum cleaner with advanced laser technology.', 250, 120, ''),
                                            ('Nespresso Vertuo', 'A coffee machine that uses Nespresso capsules to make a variety of coffee styles.', 45, 350, '');