USE northwind;

-- The employee name and title
-- of all employees who do not
-- have a boss
SELECT first_name
	,last_name
    ,title
    ,reports_to
FROM employees
WHERE reports_to IS NULL
-- Expected: 1 row

