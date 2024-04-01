package Darwhin;

import EMPLOYEE.*;
import Factory.*;
import CUSTOMER.*;
import AIRCRAFT.*;
import DBPT.*;
import java.sql.*;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Create Aircraft
        // connnect to db
        Connection conn = DBConnect.connectToDB("CropDusting_DB");

        Aircraft[] a = AircraftBuilder.buildAircraft(2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
            DBConnect.executeinsertQuery(a[i].toSql(), conn);

        }

        // Create Aircraft Availabilities
        AircraftAvailability[] AA = AircraftBuilder.buildAircraftAvailabilities(a);
        for (int i = 0; i < AA.length; i++) {
            System.out.println(AA[i].toString());
        }

        // Create Employees and their PayRecords
        Employee[] e = EmployeeBuilder.buildEmployees(2);
        for (int j = 0; j < e.length; j++) {
            System.out.println(e[j].toString());
            PayRecord[] PR = EmployeeBuilder.buildPayRecords(e);
            for (int h = 0; h < PR.length; h++) {
                System.out.println(PR[h].toString());
            }
        }

        // Create Customers, their CustomerAccounts, and JobScheduling
        Customer[] c = CustomerBuilder.buildCustomers(2);
        for (int k = 0; k < c.length; k++) {
            System.out.println(c[k].toString());
            CustomerAccount[] CA = CustomerBuilder.buildCustomerAccounts(c);
            for (int l = 0; l < CA.length; l++) {
                System.out.println(CA[l].toString());
                JobScheduling[] JS = CustomerBuilder.buildJobScheduling(CA);
                for (int o = 0; o < JS.length; o++) {
                    System.out.println(JS[o].toString());
                }
            }
        }
    }
}
