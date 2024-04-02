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
public static JobScheduling[] buildJobScheduling(Customer[] c) {
    JobScheduling[] JS = new JobScheduling[c.length];
    for (int i=0;i<c.length;i++){
        JS[i]= new JobScheduling();
           
                JS[i]= new JobScheduling(Identifiable.generateJobID(),
                    c[i].getCustomerID(),
                    Identifiable.generateJobLocation(),
                    Identifiable.generateCustomerSince(),
                    Identifiable.generateJobCost());
                
            }
            // else{
            //     Random r = new Random();
            //     JS[i]= new JobScheduling("J-000-"+ (r.nextInt(10000)),
            //         CA[i].getCustomerID(),
            //         "N/A",
            //         "2021/01/01",
            //         0.0
            //     );
    
    

return JS;
}

}