-- 1. Create a report to show
-- all orders that were placed by Drachenblut Delikatessen.

-- Columns to include:
-- -------------------
-- order_id
-- order_date
-- shipped_date


-- Order the results by shipped date, newest to oldest.
-- (6 rows)

-- Using only a sub-query (no INNER JOIN)


USE northwind;
SELECT customer_id
    ,order_id
	,order_date
    ,shipped_date
    , (
    SELECT c.company_name
    FROM customers AS c
    WHERE c.customer_id = o.customer_id) 
    AS customers
    FROM orders as o 
    WHERE (
		SELECT c.company_name
		FROM customers AS c
		WHERE c.customer_id = o.customer_id
        ) = 'Drachenblut Delikatessen'



