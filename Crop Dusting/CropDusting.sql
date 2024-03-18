DROP DATABASE IF EXISTS CropDusting_DB;
CREATE DATABASE CropDusting_DB;
USE CropDusting_DB;
CREATE TABLE customer(
    CID VARCHAR(50),
    FName VARCHAR(50),
    LName VARCHAR(50),
    CityAddress VARCHAR(50),
    StateAddress VARCHAR(50),
    ZipCode VARCHAR(10),
    PhoneNumber VARCHAR(10),
    Constraint PK_customer PRIMARY KEY(CID)

);
create TABLE employee(

);
CREATE TABLE aircraft(

);
CREATE TABLE chemical_inventory(

);
 CREATE TABLE job_schedule(

 );