package CUSTOMER;

import java.sql.Date;
import java.text.DateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author darwh
 */


import Interface.Identifiable;



public class Customer implements Identifiable{
    /**
     * The unique identifier for the customer.
     */
    private String CustomerID;
    private String FName;
    private String LName;
    private String CustomerSince; //  2021-01-01 through 2024-01-01
  
    private int count;
    public Customer(){
        
        count++;
    }

public Customer(String CustomerID, String FName, String LName,String CustomerSince
 ){
    this.CustomerID = CustomerID;
    this.FName = FName;
    this.LName = LName;
    this.CustomerSince = CustomerSince;

    
}
public int getCount() {
    return count;
}

public void setCount(int count) {
    this.count = count;
}
public String getCustomerID() {
    return CustomerID;
}

public void setCustomerID(String CustomerID) {
    CustomerID = CustomerID;
}

public String getFName() {
    return FName;
}

public void setFName(String fName) {
    FName = fName;
}

public String getLName() {
    return LName;
}

public void setLName(String lName) {
    LName = lName;
}
public String getCustomerSince() {
    return CustomerSince;
}
public void setCustomerSince(String customerSince) {
    CustomerSince = customerSince;
}


@Override
public String toString() {
   
    return super.toString();
}
public void displayMe() {
    System.out.println("***Customer Information***");
    System.out.println("Customer ID: " + CustomerID);
    System.out.println("First Name: " + FName);
    System.out.println("Last Name: " + LName);
    System.out.println("Customer Since: " + CustomerSince);
    
   
    System.out.println();
}
}
