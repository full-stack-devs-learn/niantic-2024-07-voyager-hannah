﻿/*
1.	Claire's cookies cost $12.95 a dozen.

	A customer places an order with a quantity
	of how many dozen cookies they want to order.

	This CalculateSubtotal function should calculate
	the price of an order before the cost of tax
	is added.

	calculateOrderSubtotal(1) -> 12.95
	calculateOrderSubtotal(2) -> 25.90
	calculateOrderSubtotal(5) -> 64.75

*/

function calculateOrderSubtotal(quantity)
{ const pricePerDozen = 12.95;
	const subtotal = quantity * pricePerDozen;
	return subtotal;
	console.log(calculateOrderSubtotal(1));
	console.log(calculateOrderSubtotal(2));
	console.log(calculateOrderSubtotal(5));
}


/*
2.	Claire's cookies cost $12.95 a dozen.
	The food tax rate is 5.75%
	A customer places an order with a quantity
	of how many dozen cookies they want to order.

	The calculateTax function should calculate
	the amount of tax to charge for an order.

	Hint: search for JavaScript Math functions

	calculateTax(1) -> 13.69
	calculateTax(2) -> 27.39
	calculateTax(5) -> 68.47

*/

function calculateTax(quantity)
{ const pricePerDozen = 12.95;
	const taxRate = 0.0575;
	const beforeTax = pricePerDozen * quantity;
	const taxAmount = beforeTax * taxRate;
	const totalAmount = beforeTax + taxAmount

	return parseFloat(taxAmount.toFixed(2));
}
console.log(calculateTax(1));
console.log(calculateTax(2));
console.log(calculateTax(5));






/*
3.	Claire's cookies cost $12.95 a dozen.
	The food tax rate is 5.75%

	A customer places an order with a quantity
	of how many dozen cookies they want to order.

	The calculateOrderTotal function should calculate
	the price of an order plus the cost of tax.

	Hint: search for JavaScript Math functions

	calculateOrderTotal(1) -> 13.69
	calculateOrderTotal(2) -> 27.39
	calculateOrderTotal(5) -> 68.47

*/

// create your function here

function calculateOrderTotal(quantity)
{ const pricePerDozen = 12.95;
	const taxRate = 0.0575;
	const beforeTax = pricePerDozen * quantity;
	const taxAmount = beforeTax * taxRate;
	const totalAmount = beforeTax + taxAmount

	return parseFloat(totalAmount.toFixed(2));
}
console.log(calculateOrderTotal(1));
console.log(calculateOrderTotal(2));
console.log(calculateOrderTotal(5));
/*
3.	With each order Claire needs to generate 
	a receipt to print for the customer
	and to store for her records.

	The receipt must include this information

	Customer name
	quantity (# of cookies in dozens)
	Subtotal
	Tax
	Total

	When a customer places an they specify their
	name, and the quantity of cookies that they 
	want to order (in dozens)

	The place order function should perform all
	calculations and return the receipt in 
	JavaScript object format as follows:

	placeOrder("Sean", 1) =>	{
									customer: "Sean"
									quantity: 1,
									subtotal: 12.95,
									tax: .74,
									total: 13.69
								}
	placeOrder("Sean", 2) =>	{
									customer: "Sean"
									quantity: 2,
									subtotal: 25.90,
									tax: 1.49,
									total: 27.39
								}


*/

// create your function here
function placeOrder (customerName, quantityDozens) {
const pricePerDozen = 12.95;
const taxRate = 0.0575;

const subtotal = pricePerDozen * quantityDozens

const tax = subtotal * taxRate
const total = subtotal + tax
return {
	customer : customerName,
	quantity: quantityDozens,
	subtotal: parseFloat(subtotal.toFixed(2)),
	tax: parseFloat(tax.toFixed(2)),
	total: parseFloat(total.toFixed(2))

}
}


/*
5.	Sean's classes have all earned a cookie party. 
	The number of cookies that each student receives 
	depends on their current grade in Sean's class.

	A students = 4 cookies
	B students = 3 cookies
	everyone else 2 cookies

	Claire's Cookies only sells by the dozen. Create a function
	that calculates how many dozen cookies Sean needs
	to buy based on the students grades	

	calculateCookiesNeeded(2, 4, 8) → 3
	calculateCookiesNeeded(1, 5, 12) → 5
	calculateCookiesNeeded(2, 2) → 8

*/

// create your function here
function calculateCookiesNeeded(A, B, Other) {
	const cookiesPerGrade = {
		A:4,
		B:3,
		Other:2
	};
	const totalCookies = (A * cookiesPerGrade.A) +
	(B * cookiesPerGrade.B) +
	(Other * cookiesPerGrade.Other);

	const dozensRequired = Math.ceil(totalCookies / 12);
	return dozensRequired;
}
