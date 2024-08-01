USE northwind;

-- The Product name, price and category id
-- of all dairy products
SELECT product_name
	,unit_price
    ,category_name
    ,category_id
FROM products_by_category
WHERE category_name = 'Dairy Products'

-- Expected: 10 rows

