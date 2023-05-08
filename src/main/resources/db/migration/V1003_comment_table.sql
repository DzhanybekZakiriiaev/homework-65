CREATE TABLE IF NOT EXISTS `user_product_comment` (
                                                      `id` SERIAL PRIMARY KEY,
                                                      `user_id` INT NOT NULL,
                                                      `product_id` INT NOT NULL,
                                                      `comment` TEXT,
                                                      FOREIGN KEY (`user_id`) REFERENCES `users`(`id`) ON DELETE CASCADE,
    FOREIGN KEY (`product_id`) REFERENCES `product`(`product_id`) ON DELETE CASCADE
    );
