DROP DATABASE IF EXIST City_Tech_CropDusting_DB;
CREATE DATABASE CropDusting_DB;
USE CropDusting_DB;
CREATE TABLE customer(
    CustomerID VARCHAR(50),
    FName VARCHAR(50),
    LName VARCHAR(50),
    CityAddress VARCHAR(50),
    StateAddress VARCHAR(50),
    ZipCode VARCHAR(10),
    PhoneNumber VARCHAR(10),
    Constraint PK_customer PRIMARY KEY(CID)

);
Create Table Customer_ Account(
    CustomerID VARCHAR(50),
    AccountStatus VARCHAR(50),
    Customer_since DATE,
    Constraint PK_Customer_Account PRIMARY KEY(CustomerID)



);
create TABLE Employee(
    EmployeeID VARCHAR(50),
    FName VARCHAR(50),
    LName VARCHAR(50),
    Posititon  VARCHAR(50),
    Department VARCHAR(50),
    EmploymentSartDate DATE,
    Constraint PK_employee PRIMARY KEY(EmployeeID)

);
CREATE TABLE Pay_Record(
    EmployeeID VARCHAR(50),
    Salary DECIMAL(10,2),
    PayDate DATE,
    Constraint PK_Pay_Record PRIMARY KEY(EmployeeID),


);
CREATE TABLE Aircraft(

);
 CREATE TABLE job_schedule(

 );