-- 10. Count of films in each category
-- that GRACE MOSTEL has appeared in as an actress

-- include first_name, last_name, category_name, film_count

-- (11 rows)

USE sakila;
										
SELECT a.first_name
,a.last_name
,c.name
,COUNT(*) AS actor_count

FROM actor AS a
INNER JOIN film_actor AS fa
ON a.actor_id = fa.actor_id

INNER JOIN film AS f
ON fa.film_id = f.film_id

INNER JOIN film_category AS fc
ON f.film_id = fc.film_id

INNER JOIN category AS c       
ON c.category_id = fc.category_id

WHERE a.first_name = 'Grace'
 AND a.last_name = 'MOSTEL'
GROUP BY 
a.first_name
,a.last_name
,c.name

ORDER BY actor_count DESC

