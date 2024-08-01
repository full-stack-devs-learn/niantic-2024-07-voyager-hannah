USE northwind;

-- Use the customer_orders view that we created
-- return the: CompanyName, OrderDate, OrderId,
-- ProductName, SalesPrice, Quantity, Discount,
-- SubTotal, LineDiscount and LineTotal
-- for all orders where the line discount is

-- for all order line items with a LineDiscount that is more than $1000

-- sort the rows by discount highest to lowest
SELECT company_name
	,discount
	,order_date
    ,order_id
	,product_name
    ,(sales_price * (1 - discount) * quantity) AS line_total
	,((sales_price * quantity)-discount) AS subtotal
    ,(sales_price * quantity * discount) AS total_discount 
FROM customer_orders
WHERE (sales_price * quantity * discount) > 1000
ORDER BY (sales_price * quantity * discount) DESC
-- Expected: 8 Rows

