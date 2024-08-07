USE northwind;

-- Insert 10 new products into the new Sporting Goods Category
-- You can leave the Supplier Id empty for now, but you need to include
-- the product name, category, price, units in stock (20), units on order (0)
-- and re-order level (10) for each product.

INSERT INTO products
( category_id,
product_name,
unit_price,
units_in_stock,
units_on_order,
reorder_level
)

VALUES
(9,'Baseball', 12, 20, 0, 10),
(9,'Basketball', 15, 20, 0, 10),
(9,'Baseball Bat', 20, 20, 0, 10),
(9,'Tent', 50, 20, 0, 10),
(9,'Raft', 35, 20, 0, 10),
(9,'Softball', 10, 20, 0, 10),
(9,'Running Shoes', 30, 20, 0, 10),
(9,'Tennis Ball', 5, 20, 0, 10),
(9,'Basketball Hoop', 80, 20, 0, 10),
(9,'Helmet', 20, 20, 0, 10),
(9,'Soccerball', 15, 20, 0, 10);




