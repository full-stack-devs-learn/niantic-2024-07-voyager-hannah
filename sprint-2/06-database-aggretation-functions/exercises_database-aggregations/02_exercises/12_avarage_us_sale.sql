-- 12. The average line_item amount for all sales in the US
-- (Use the customer_orders view)
-- expect approx $748.77

SELECT 
AVG(sales_price * quantity) AS average_sales
FROM customer_orders
WHERE country IN ('USA');


-- (1 row)



