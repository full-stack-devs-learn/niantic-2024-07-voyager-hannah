-- 8. The smallest line item amount made in Europe
-- (Use the customer_orders view)
SELECT 
sales_price * quantity AS smallest_line_amount
FROM customer_orders
WHERE country IN('Germany', 'Switzerland', 'France','Portugal','Finland','Poland', 'Ireland', 'Sweden','UK')
ORDER BY smallest_line_amount
LIMIT 1;
-- (1 row) $4.80




