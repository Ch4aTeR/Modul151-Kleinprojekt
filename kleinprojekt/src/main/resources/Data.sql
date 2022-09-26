INSERT INTO Person (id, Customer_Name, Contact_Email, Address, City, Postal_Code, Country)
SELECT *
FROM CSVREAD('classpath:Mock_Data.csv');