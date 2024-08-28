-- 8. The sum of all sales in the UK
-- sales_price * quantity -- don't worry about discount
-- (Use the customer_orders view)

SELECT SUM(sales_price * quantity) AS sum_of_all_sales
FROM customer_orders
WHERE country IN('UK')
-- (1 row) - $60616.51




