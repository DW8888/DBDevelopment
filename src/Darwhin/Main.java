
package Darwhin;

import java.sql.ResultSet;
import java.sql.SQLException;

import DBPT.DBConnect;
import EMPLOYEE.*;
import Factory.*;
import Interface.*;
import CUSTOMER.*;
import AIRCRAFT.*;
import Enums.*;



    public class Main {
  /*   public static void main(String[] args) throws ClassNotFoundException, SQLException{
       
    // ResultSet R= DBConnect.executeResultsQuery("Select * from persons",
    // "City_Tech_CropDusting_DB");

    } */
    public static void main(String[] args) {
        Aircraft[] a = AircraftBuilder.buildAircraft(5);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
            AircraftAvailability[] AA = AircraftBuilder.buildAircraftAvailabilities(a);
            for (int j = 0; j < AA.length; j++) {
                System.out.println(AA[j].toString());
            }
        }
        Employee[] e = EmployeeBuilder.buildEmployees(5);
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].toString());
            PayRecord[] PR = EmployeeBuilder.buildPayRecords(e);
            for (int j = 0; j < PR.length; j++) {
                System.out.println(PR[j].toString());
            }
        }
        Customer[] c = CustomerBuilder.buildCustomers(5);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].toString());
            CustomerAccount[] CA = CustomerBuilder.buildCustomerAccounts(c);
            for (int j = 0; j < CA.length; j++) {
                System.out.println(CA[j].toString());
            }
            JobScheduling[] JS = CustomerBuilder.buildJobScheduling(CA);
            for (int k = 0; k < JS.length; k++) {
                System.out.println(JS[k].toString());
            }
        }


    }
}
