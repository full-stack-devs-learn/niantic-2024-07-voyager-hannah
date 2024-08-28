-- 11. The average sales amount for all sales in Europe
-- (Use the customer_orders view)

SELECT 
AVG(sales_price * quantity) AS average_sales
FROM  customer_orders
WHERE country IN('Germany', 'Switzerland', 'France','Portugal','Finland','Poland', 'Ireland', 'Sweden','UK')
-- (1 row) approx $605.99




