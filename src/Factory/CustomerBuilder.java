package Factory;

import CUSTOMER.Customer;
import CUSTOMER.CustomerAccount;
import CUSTOMER.JobScheduling;
import Interface.Identifiable;

/**
 * The CustomerBuilder class is responsible for building customer-related objects.
 */
public class CustomerBuilder {
    Customer[] c; 
    CustomerAccount[] CA; 
    JobScheduling[] JS;
    
    /**
     * Builds an array of Customer objects.
     * 
     * @param n The number of customers to build.
     * @return An array of Customer objects.
     */
    public static Customer[] buildCustomers(int n) {
        final Customer[] c = new Customer[n];
        
        for (int i = 0; i < n; i++) {
            c[i] = new Customer(
                Identifiable.generateCustomerID(),
                Identifiable.generateFName(),
                Identifiable.generateLName(), 
                Identifiable.generateCustomerSince()
            );
        }
        
        return c;
    }
    
    /**
     * Builds an array of CustomerAccount objects based on the given array of Customer objects.
     * 
     * @param c An array of Customer objects.
     * @return An array of CustomerAccount objects.
     */
    public static CustomerAccount[] buildCustomerAccounts(Customer[] c) {   
        CustomerAccount[] CA = new CustomerAccount[c.length];
        
        for (int i = 0; i < c.length; i++) { 
            CA[i] = new CustomerAccount(
                c[i].getCustomerID(),
                Identifiable.generateAccountStatus(),
                Identifiable.generateAccountBalance()
            );
        }
        
        return CA;
    }
    
    /**
     * Builds an array of JobScheduling objects based on the given array of Customer objects.
     * 
     * @param c An array of Customer objects.
     * @return An array of JobScheduling objects.
     */
    public static JobScheduling[] buildJobScheduling(Customer[] c) {
        JobScheduling[] JS = new JobScheduling[c.length];
        
        for (int i = 0; i < c.length; i++) {
            JS[i] = new JobScheduling(
                Identifiable.generateJobID(),
                c[i].getCustomerID(),
                Identifiable.generateJobLocation(),
                Identifiable.generateCustomerSince(),
                Identifiable.generateJobCost()
            );
        }
        
        return JS;
    }
}