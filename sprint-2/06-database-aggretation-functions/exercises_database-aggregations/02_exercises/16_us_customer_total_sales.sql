-- 16. Total sales by customer in the US
-- Include the company_name, state and total_sales
-- Sort alphabetically by state, then by total sales desc
-- (Use the customer_orders view)
SELECT 
region
,SUM(sales_price * quantity) AS  total_sales
FROM customer_orders
WHERE region IN ('ID', 'OR', 'WA', 'NM', 'AK', 'WY', 'CA', 'MT' )
GROUP BY region,
company_name


-- (13 rows)



