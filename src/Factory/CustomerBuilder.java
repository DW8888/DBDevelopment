package Factory;

import CUSTOMER.Customer;
import CUSTOMER.CustomerAccount;
import Interface.Identifiable;

public class CustomerBuilder {
    public static Customer[] buildCustomers(int n) {
        Customer[] c = new Customer[n];
        CustomerAccount[] CA= new CustomerAccount[n]; 
        for (int i = 0; i < n; i++) {
            
            c[i] = new Customer(
                Identifiable.generateCustomerID(),
                Identifiable.generateFName(),
                Identifiable.generateLName(), 
                Identifiable.generateCustomerSince()
            );
                CA[i]= new CustomerAccount(
                c[i].getCustomerID(),
                Identifiable.generateAccountStatus(),
                Identifiable.generateAccountBalance()
            )
            ;
        }
        return c;
    }
    public static void displayCustomers(Customer[] c) {
        for (Customer customer : c) {
            customer.displayMe();
        }

   
    }
}