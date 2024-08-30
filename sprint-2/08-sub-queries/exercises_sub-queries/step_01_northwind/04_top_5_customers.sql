-- 4. Using only sub-queries
-- Display the names of my top 5 customer
-- and the number of orders each has placed
-- the number of orders  determines top customer

-- (first 5 rows)
-- Save-a-lot Markets               31
-- Ernst Handel                     30
-- QUICK-Stop                       28
-- Folk och f HB                    19
-- Hungry Owl All-Night Grocers     19


USE northwind;

SELECT 
company_name
,( 
SELECT COUNT(*) AS orders_placed
FROM orders as o
WHERE o.customer_id = c.customer_id) AS top_customer

FROM customers AS c

ORDER BY top_customer DESC
LIMIT 5;