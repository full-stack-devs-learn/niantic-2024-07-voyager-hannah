
DROP DATABASE IF EXISTS budget;

CREATE DATABASE budget;

USE budget;

CREATE TABLE people
(
	personal_id INT NOT NULL AUTO_INCREMENT,
	person_name VARCHAR(30) NOT NULL,
	PRIMARY KEY (personal_id)
);

CREATE TABLE categories
(
category_id INT NOT NULL AUTO_INCREMENT,
category_name VARCHAR(30) NOT NULL,
PRIMARY KEY (category_id)
);
 
CREATE TABLE purchases
(
purchase_id INT NOT NULL AUTO_INCREMENT,
purchase_history VARCHAR(30) NOT NULL,
PRIMARY KEY (purchase_id),
category_id INT,
FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

CREATE TABLE expenses
(
expenses_id INT NOT NULL AUTO_INCREMENT,
purchase_cost decimal(10,2) NOT NULL,
purchase_date VARCHAR(20) NOT NULL,
notes VARCHAR(100) NULL,
vendor VARCHAR(30),
personal_id INT,
purchase_id INT,
PRIMARY KEY(expenses_id),
FOREIGN KEY (personal_id) REFERENCES people(personal_id),
FOREIGN KEY (purchase_id) REFERENCES purchases(purchase_id)
);
INSERT INTO categories(category_name)
VALUES
('Housing'),
('Transportation'),
('Food'),
('Healthcare'),
('Entertainment'),
('Vacation'),
('Housing'),
('Transportation'),
('Food'),
('Healthcare'),
('Entertainment'),
('Vacation'),
('Housing'),
('Transportation'),
('Food'),
('Healthcare'),
('Entertainment'),
('Vacation'),
('Food'),
('Housing');

INSERT INTO people(person_name)

VALUES 
('Bobby Boba'),
('Betsy Boba'),
('Bobby Boba'),
('Betsy Boba'),
('Bobby Boba'),
('Betsy Boba'),
('Bobby Boba'),
('Betsy Boba'),
('Bobby Boba'),
('Betsy Boba'),
('Bobby Boba'),
('Betsy Boba'),
('Bobby Boba'),
('Betsy Boba'),
('Bobby Boba'),
('Betsy Boba'),
('Bobby Boba'),
('Betsy Boba'),
('Bobby Boba'),
('Betsy Boba');

INSERT INTO purchases(purchase_history,category_id)
VALUES
('Rent',1),
('Gas',2),
('Groceries',3),
('Rx',4),
('Movies',5),
('Flight',6),
('Utilities',7),
('Subway',8),
('Restaurant',9),
('Dr Visit',10),
('Netflix',11),
('Hotel',12),
('Utilities',13),
('Car Maintenance',14),
('Snacks',15),
('OTC Medicine',16),
('Sports',17),
('Car Rental',18),
('Groceries',19),
('Internet',20);

INSERT INTO expenses(purchase_cost, purchase_date, notes, vendor,personal_id,purchase_id)
VALUES 
(1200, 2024-05-01, 'Rent Payment','Landlord Inc',1,1),
(40, 2024-05-03, 'Gas Tank','Shell Gas Station',2,2),
(150, 2024-05-05,'Weekly Grocery Shopping','Fresh Mart',3,3),
(20, 2024-05-07, 'Prescription Refill','CVS Pharmacy',4,4),
(30, 2024-05-10, 'Movie Night','Cinemax Theater',5,5),
(300, 2024-05-12, 'Booked flight','Delta Airlines',6,6),
(100, 2024-05-15, 'Electricity Bill','PowerCo',7,7),
(20, 2024-05-17, 'Monthly subway pass','Metro Transit',8,8),
(25, 2024-05-20, 'Boba','Miss Boba',9,9),
(50, 2024-05-22, 'Check up','HealthFirst Clinic',10,10),
(15, 2024-05-25, 'Netflix','Netflix',11,11),
(200, 2024-05-28, 'Hotel','Oceanfront Resort',12,12),
(50, 2024-05-01, 'Water Bill','WaterWorks',13,13),
(100, 2024-05-04, 'Car Oil Change','AutoWorks',14,14),
(10, 2024-05-09, 'Movie night snacks','Snack Haven',15,15),
(15, 2024-05-14, 'Cold medicine','OTC Medicine',16,16),
(50,2024-05-18, 'Baseball tickets','Sports Arena',17,17),
(150, 2024-05-23, 'Rental car','Zoom Car Rentals',18,18),
(80, 2024-05-26, 'Groceries','Farmers Market',19,19),
(60, 2024-05-30, 'Internet Bill','FastNet',20,20);
















    