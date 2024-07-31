USE northwind;

-- The company name, contact name, title and phone of 
-- all customers where the contact is the owner 
-- of the company
-- Expected: 17 rows
SELECT contact_title
	,phone
    ,contact_name
FROM customers
WHERE contact_title = 'Owner'