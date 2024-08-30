-- 3.  List of all the categories 
-- that Alfreds Futterkiste has ever ordered
-- (5 rows)

USE Northwind;

SELECT DISTINCT company_name
,category_name

FROM customers AS c
INNER JOIN orders AS o
ON o.customer_id = c.customer_id

INNER JOIN order_details AS od
ON o.order_id = od.order_id

INNER JOIN products AS p
ON p.product_id = od.product_id

INNER JOIN categories AS cc
ON cc.category_id = p.category_id

WHERE company_name ='Alfreds Futterkiste'