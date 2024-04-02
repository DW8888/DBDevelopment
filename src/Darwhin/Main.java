package Darwhin;

import EMPLOYEE.*;
import Factory.*;
import CUSTOMER.*;
import AIRCRAFT.*;
import DBPT.*;
import java.sql.*;

/**
 * The Main class is the entry point of the program.
 * It creates aircraft, aircraft availabilities, employees, pay records, customers, customer accounts, and job scheduling.
 * It also connects to a database and executes SQL statements to insert data.
 */
public class Main {

    /**
     * The main method is the entry point of the program.
     * It creates aircraft, aircraft availabilities, employees, pay records, customers, customer accounts, and job scheduling.
     * It also connects to a database and executes SQL statements to insert data.
     *
     * @param args The command line arguments.
     * @throws ClassNotFoundException If the database driver class is not found.
     * @throws SQLException If there is an error executing SQL statements.
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // Create Aircraft
        // connnect to db
       int count=0;// count of statements executed
        String db="CropDusting_DB";
       
        Aircraft[] a = AircraftBuilder.buildAircraft(4);
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i].toString());
            

        }

        // Create Aircraft Availabilities
        Connection conn = DBConnect.connectToDB(db);
        DBConnect.switchToDB(conn,"USE " + db);
        AircraftAvailability[] AA = AircraftBuilder.buildAircraftAvailabilities(a);
        for (int i = 0; i < AA.length; i++) {
            //System.out.println(AA[i].toString());
            
            
            PreparedStatement  psAA = conn.prepareStatement(AA[i].toSql());
            psAA.executeUpdate();
           
            PreparedStatement  psa = conn.prepareStatement(a[i].toSql());
            psa.executeUpdate(); 
        }
        count+=a.length*2;

        // Create Employees and their PayRecords
        Employee[] e = EmployeeBuilder.buildEmployees(8);
        for (int j = 0; j < e.length; j++) {
            //System.out.println(e[j].toString());}
        }
            PayRecord[] PR = EmployeeBuilder.buildPayRecords(e);
            for (int h = 0; h < PR.length; h++) {
                //System.out.println(PR[h].toString());
                PreparedStatement  psPR = conn.prepareStatement(PR[h].toSql());
                psPR.executeUpdate();
                PreparedStatement  pse = conn.prepareStatement(e[h].toSql());
                pse.executeUpdate();
            }

        count+=e.length*2;;
        // Create Customers, their CustomerAccounts, and JobScheduling
        Customer[] c = CustomerBuilder.buildCustomers(10);
        for (int k = 0; k < c.length; k++) {
            //System.out.println(c[k].toString());
            
        }
            CustomerAccount[] CA = CustomerBuilder.buildCustomerAccounts(c);
            for (int l = 0; l < CA.length; l++) {
                //System.out.println(CA[l].toString());
            }
                JobScheduling[] JS = CustomerBuilder.buildJobScheduling(c);
                for (int o = 0; o < JS.length; o++) {
                   // System.out.println(JS[o].toString());
                   PreparedStatement  psc = conn.prepareStatement(c[o].toSql());
                   psc.executeUpdate();
                    PreparedStatement  psJS = conn.prepareStatement(JS[o].toSql());
                    psJS.executeUpdate();
                    PreparedStatement  psCA = conn.prepareStatement(CA[o].toSql());
                    psCA.executeUpdate();
                  
                }
        count+=c.length*3;
        System.out.println(count + " statements executed");
            
        
    }
}
