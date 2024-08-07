USE northwind;

-- Insert 10 new products into the new Sporting Goods Category
-- You can leave the Supplier Id empty for now, but you need to include
-- the product name, category, price, units in stock (20), units on order (0)
-- and re-order level (10) for each product.
ALTER TABLE products
ADD Category varchar (30);

INSERT INTO products
( category,
product_name,
unit_price,
units_in_stock,
units_on_order,
reorder_level
)

VALUES
('Sporting Goods','Baseball', 12, 20, 0, 10),
('Sporting Goods','Basketball', 15, 20, 0, 10),
('Sporting Goods','Baseball Bat', 20, 20, 0, 10),
('Sporting Goods','Tent', 50, 20, 0, 10),
('Sporting Goods','Raft', 35, 20, 0, 10),
('Sporting Goods','Softball', 10, 20, 0, 10),
('Sporting Goods','Running Shoes', 30, 20, 0, 10),
('Sporting Goods','Tennis Ball', 5, 20, 0, 10),
('Sporting Goods','Basketball Hoop', 80, 20, 0, 10),
('Sporting Goods','Helmet', 20, 20, 0, 10),
('Sporting Goods','Soccerball', 15, 20, 0, 10);




