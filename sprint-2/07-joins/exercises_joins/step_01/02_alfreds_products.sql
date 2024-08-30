-- 2. The name of all products that
-- have been ordered by Alfreds Futterkiste
-- Include each product only once
-- (11 rows)

USE Northwind;

SELECT  DISTINCT p.product_name
 ,c.company_name
		
FROM customers AS  c
INNER JOIN orders AS o
ON o.customer_id =c.customer_id

INNER JOIN order_details as od
ON o.order_id = od.order_id

INNER JOIN products as p
ON p.product_id = od.product_id

WHERE c.company_name = 'Alfreds Futterkiste'
