-- 4. I want to know what category is the most popular
-- category for my best customer.

-- SELECT the Company Name, Category, and the OrderCount
-- for Save-a-lot Markets. (my best customer)
-- (the order count specifies how many times a category
-- was included in their orders)

-- sort in the order of the most ordered category to the least

-- (8 rows)

USE northwind;

SELECT cc.category_name
,c.company_name

,COUNT(*) AS order_count 

FROM customers AS c
INNER JOIN orders AS o
ON o.customer_id = c.customer_id

INNER JOIN order_details AS od
ON o.order_id = od.order_id 

INNER JOIN products as p
ON od.product_id = p.product_id

INNER JOIN categories as cc
ON cc.category_id = p.category_id

WHERE company_name = 'Save-a-lot Markets'
GROUP BY  cc.category_name
,c.company_name

ORDER BY order_count DESC
