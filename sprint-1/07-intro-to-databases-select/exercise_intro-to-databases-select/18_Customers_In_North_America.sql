USE northwind;

-- The name and country
-- of all customers in North America
-- Canada, USA, Mexico
-- Sort the results by country in alphabetic order
SELECT company_name
	,country
FROM customers
WHERE country IN ('USA','Canada','Mexico')
ORDER BY Country



-- Expected: 21 Rows

