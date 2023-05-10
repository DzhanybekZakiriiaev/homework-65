CREATE TABLE IF NOT EXISTS `buckets` (
                                         id SERIAL PRIMARY KEY,
                                         user_id INT NOT NULL,
                                         product_id INT NOT NULL,
                                         FOREIGN KEY (user_id) REFERENCES `users`(id),
    FOREIGN KEY (product_id) REFERENCES `product`(product_id)
    );

