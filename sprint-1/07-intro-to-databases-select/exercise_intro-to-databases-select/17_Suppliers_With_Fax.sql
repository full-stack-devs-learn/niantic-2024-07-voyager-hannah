USE northwind;

-- The name, contact, phone and fax number of 
-- all suppliers for whom we
-- have a fax number
SELECT company_name
	,contact_name
    ,contact_title
	,phone
    ,fax
FROM customers
WHERE fax IS NOT NULL
-- Expected: 13 rows

