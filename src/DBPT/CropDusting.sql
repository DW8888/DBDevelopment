-- Drop the database if it exists
DROP DATABASE IF EXISTS CropDusting_DB;

-- Create the database
CREATE DATABASE CropDusting_DB;

-- Switch to the created database
USE CropDusting_DB;

-- Create the Customer table
CREATE TABLE Customer(
    CustomerID VARCHAR(50),
    FName VARCHAR(50),
    LName VARCHAR(50),
    CustomerSince DATE,
    CONSTRAINT PK_Customer PRIMARY KEY(CustomerID)
);

-- Create the Customer_Account table
CREATE TABLE Customer_Account(
    CustomerID VARCHAR(50),
    AccountStatus VARCHAR(50),
    AccountBalance DECIMAL(10, 2),
    CONSTRAINT PK_Customer_Account PRIMARY KEY(CustomerID),
    CONSTRAINT FK_Customer_Account_CustomerID FOREIGN KEY(CustomerID) REFERENCES Customer(CustomerID)
);

-- Create the Pay_Record table
CREATE TABLE Pay_Record(
    EmployeeID VARCHAR(50),
    Salary DECIMAL(10, 2),
    PayDate DATE,
    CONSTRAINT PK_Pay_Record PRIMARY KEY(EmployeeID)
);

-- Create the Employee table
CREATE TABLE Employee(
    EmployeeID VARCHAR(50),
    FName VARCHAR(50),
    LName VARCHAR(50),
    Position VARCHAR(50),
    Department VARCHAR(50),
    EmploymentStartDate DATE,
    CONSTRAINT PK_Employee PRIMARY KEY(EmployeeID),
    CONSTRAINT FK_Employee_EmployeeID FOREIGN KEY(EmployeeID) REFERENCES Pay_Record(EmployeeID)
);

-- Create the Aircraft_Availability table
CREATE TABLE Aircraft_Availability(
    AircraftID VARCHAR(50),
    AircraftStatus VARCHAR(50),
    CONSTRAINT PK_Aircraft_Availability PRIMARY KEY(AircraftID)
);

-- Create the Aircraft table
CREATE TABLE Aircraft(
    AircraftID VARCHAR(50),
    AircraftType VARCHAR(50),
    AircraftLocation VARCHAR(50),
    CONSTRAINT PK_Aircraft PRIMARY KEY(AircraftID),
    CONSTRAINT FK_Aircraft_AircraftID FOREIGN KEY(AircraftID) REFERENCES Aircraft_Availability(AircraftID)
);

-- Create the Job_Scheduling table
CREATE TABLE Job_Scheduling(
    JobID VARCHAR(50),
    CustomerID VARCHAR(50),
    JobLocation VARCHAR(50),
    JobDate DATE,
    JobCost DECIMAL(10, 2),
    CONSTRAINT PK_Job_Scheduling PRIMARY KEY(JobID),
    CONSTRAINT FK_Job_Scheduling_CustomerID FOREIGN KEY(CustomerID) REFERENCES Customer(CustomerID)
);