-- 7. Select the price of the most expensive product
SELECT product_name
		,unit_price
FROM products
ORDER BY unit_price DESC
LIMIT 1;
-- (1 row)



