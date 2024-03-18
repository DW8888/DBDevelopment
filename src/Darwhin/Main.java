/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Darwhin;

import java.sql.ResultSet;
import java.sql.SQLException;

import DBPT.DBConnect;
import Entities.Customer;
import Factory.CustomerBuilder;

/**
 *
 * @author darwh
 */
// public class Main {
    /**
     * @param args
     */
    // public static void main(String[] args) {
    //     Customer[] c = CustomerBuilder.buildCustomers(10);
    //     CustomerBuilder.displayCustomers(c);
    // }
    public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
       
    ResultSet R= DBConnect.executeResultsQuery("Select * from persons",
    "City_Tech_CropDusting_DB");

    }
    
}
