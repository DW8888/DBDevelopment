package Entities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author darwh
 */


import Interface.Identifiable;

import java.util.UUID;

public class Customer implements Identifiable{
    private String CID;
    private String FName;
    private String LName;
    private String cityAddress;
    private String stateAddress;
    private String zipCode;
    private String phoneNumber;
    private int count;
    public Customer(){
        
        count++;
    }

public Customer(String CID, String FName, String LName,
 String cityAddress, String stateAddress, String zipCode, String phoneNumber){
    this.CID = CID;
    this.FName = FName;
    this.LName = LName;
    this.cityAddress = cityAddress;
    this.stateAddress = stateAddress;
    this.zipCode = zipCode;
    this.phoneNumber = phoneNumber;
    
}
public int getCount() {
    return count;
}

public void setCount(int count) {
    this.count = count;
}
public String getCID() {
    return CID;
}

public void setCID(String cID) {
    CID = cID;
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

public String getCityAddress() {
    return cityAddress;
}

public void setCityAddress(String cityAddress) {
    this.cityAddress = cityAddress;
}

public String getStateAddress() {
    return stateAddress;
}

public void setStateAddress(String stateAddress) {
    this.stateAddress = stateAddress;
}

public String getZipCode() {
    return zipCode;
}

public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
   
    return super.toString();
}
public void displayMe() {
    System.out.println("***Customer Information***");
    System.out.println("Customer ID: " + CID);
    System.out.println("First Name: " + FName);
    System.out.println("Last Name: " + LName);
    System.out.println("City: " + cityAddress);
    System.out.println("State: " + stateAddress);
    System.out.println("Zip Code: " + zipCode);
    System.out.println("Phone Number: " + phoneNumber);
   
    System.out.println();
}
}
