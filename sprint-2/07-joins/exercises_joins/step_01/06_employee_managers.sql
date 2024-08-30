-- 6. Select the full name of each employee
-- and the full name of their manager

-- hint look at the employee table to see how to
-- determine who the manager is of each employee

-- you will need to do a "self join" to the employees table
-- and you will need to create table aliases to complete this query

-- (9 rows)

USE northwind;

SELECT 
    CONCAT(e1.first_name, ' ', e1.last_name) AS employee_full_name,
    CONCAT(e2.first_name, ' ', e2.last_name) AS manager_full_name
FROM employees AS e1
LEFT JOIN employees AS e2
    ON e1.reports_to = e2.employee_id;