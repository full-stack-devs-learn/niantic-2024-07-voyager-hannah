USE northwind;

-- The company name, contact name, title and phone of 
-- all customers where the contact has the word manager
-- in their title
SELECT company_name
	,contact_name
    ,contact_title
FROM customers
WHERE contact_title LIKE '%Manager%'
-- Expected: 17 rows

