package Factory;

import Entities.Customer;
import java.util.ArrayList;
import Enums.CountryState;
import java.util.Random;
import java.util.UUID;
import Interface.Identifiable;

public class CustomerBuilder {
    public static Customer[] buildCustomers(int n) {
        Customer[] c = new Customer[n]; 
        for (int i = 0; i < n; i++) {
            String state = Identifiable.generateState();
            c[i] = new Customer(
                Identifiable.generateCID(),
                Identifiable.generateFName(),
                Identifiable.generateLName(),
                Identifiable.chooseCity(state),
                state,
                Identifiable.generateZipcodeString(state),
                Identifiable.generatePhoneNumber()
            );
        }
        return c;
    }
    public static void displayCustomers(Customer[] c) {
        for (Customer customer : c) {
            customer.displayMe();
        }

   
    }
}