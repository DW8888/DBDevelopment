/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Darwhin;

import Entities.Customer;
import Factory.CustomerBuilder;

/**
 *
 * @author darwh
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Customer[] c = CustomerBuilder.buildCustomers(10);
        CustomerBuilder.displayCustomers(c);
    }
    
    
    
}
