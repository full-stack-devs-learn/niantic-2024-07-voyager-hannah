-- 15. number of orders placed in each state in the US
-- sort by highest order count to lowest
-- (Use the customer_orders View)
SELECT 
DISTINCT DISTINCT COUNT(DISTINCT order_id) AS order_count
,region
FROM customer_orders
WHERE region IN ('ID', 'OR', 'WA', 'NM', 'AK', 'WY', 'CA', 'MT' )
GROUP BY region

-- hint: only count each order_id once

-- ID   31
-- OR   28
-- WA   19
-- NM   18
-- AK   10
-- WY   9
-- CA   9
-- MT   3

-- (8 row)





