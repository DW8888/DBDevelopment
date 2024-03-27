package Factory;

import CUSTOMER.Customer;
import CUSTOMER.CustomerAccount;
import CUSTOMER.JobScheduling;
import Interface.Identifiable;

public class CustomerBuilder {
    Customer[]c; CustomerAccount[]CA; JobScheduling[]JS;
    public static Customer[] buildCustomers(int n) {
        
       final Customer[] c = new Customer[n];
        
       
        
        for ( int i = 0; i < n; i++) {
       
        
            
            c[i] = new Customer(
                Identifiable.generateCustomerID(),
                Identifiable.generateFName(),
                Identifiable.generateLName(), 
                Identifiable.generateCustomerSince()
            );
            
        }
        return c;
      }
            public static CustomerAccount[] buildCustomerAccounts(Customer[] c) {   
                CustomerAccount[] CA = new CustomerAccount[c.length];
                // Declare and initialize the 'c' array variable
                for (int i=0;i<c.length;i++){ 
                    CA[i]= new CustomerAccount(
                        c[i].getCustomerID(),
                        Identifiable.generateAccountStatus(),
                        Identifiable.generateAccountBalance()
                    );
                }
                return CA;
            }
public static JobScheduling[] buildJobScheduling(CustomerAccount[] CA) {
    JobScheduling[] JS = new JobScheduling[CA.length];
    for (int i=0;i<CA.length;i++){
        JS[i]= new JobScheduling();
            if(CA[i].getAccountStatus().equals("ACTIVE")){
                JS[i]= new JobScheduling(
                    CA[i].getCustomerID(),
                    Identifiable.generateJobLocation(),
                    Identifiable.generateCustomerSince(),
                    Identifiable.generateJobCost()
                );
            }
            else{
                JS[i]= new JobScheduling(
                    CA[i].getCustomerID(),
                    "N/A",
                    "N/A",
                    null
                );
    }
    
}
return JS;
}

}