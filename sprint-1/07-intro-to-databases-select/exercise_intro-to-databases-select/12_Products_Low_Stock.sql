USE northwind;
SELECT product_name
	,units_in_stock
    ,reorder_level
FROM products
WHERE units_in_stock < reorder_level



-- The Product name, UnitsInStock
-- of all products that are low in stock
-- (They have fallen below the re-order level)

-- Expected: 18 rows

