CREATE TABLE IF NOT EXISTS store_stock (
    store_stock_id SERIAL PRIMARY KEY,
    store_id INT REFERENCES store(store_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
    stock_id INT REFERENCES stock(stock_id) ON DELETE NO ACTION ON UPDATE NO ACTION
    );

CREATE TABLE IF NOT EXISTS stock_product (
    id_stock_product SERIAL PRIMARY KEY,
    stock_id INT REFERENCES stock(stock_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
    product_id INT REFERENCES product(product_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
    number INT
    );

CREATE TABLE IF NOT EXISTS store_product (
    store_product_id SERIAL PRIMARY KEY,
    store_id INT REFERENCES store(store_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
    product_id INT REFERENCES product(product_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
    number INT
    );