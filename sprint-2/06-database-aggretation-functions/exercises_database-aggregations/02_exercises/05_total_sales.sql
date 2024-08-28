-- 5. The sum of all sales
-- sales_price * quantity -- don't worry about discount
-- (Use the customer_order view)
USE northwind;
SELECT  
SUM(sales_price * quantity) AS sum_of_sales_price_and_quantity
FROM customer_orders

-- (1 row) -- 1354489.59





