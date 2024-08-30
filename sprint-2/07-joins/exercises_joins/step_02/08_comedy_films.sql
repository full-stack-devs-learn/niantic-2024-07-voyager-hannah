-- 8. Display the Category Name, and film title of all films
-- in the "Comedy" category

-- (58 rows)

USE sakila;
SELECT c.name
,f.title

FROM film as f
INNER JOIN film_category AS fc
ON fc.film_id = f.film_id

INNER JOIN category AS c       
ON c.category_id = fc.category_id

WHERE c.name = 'Comedy'