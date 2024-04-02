package Factory;
import EMPLOYEE.*;
import Interface.*;

/**
 * The EmployeeBuilder class is responsible for building arrays of Employee objects and PayRecord objects.
 */
public class EmployeeBuilder {
    Employee[] e; PayRecord[] PR; 

    /**
     * Builds an array of Employee objects.
     * 
     * @param n The number of Employee objects to build.
     * @return An array of Employee objects.
     */
    public static Employee[] buildEmployees(int n) {
        
       final Employee[] e = new Employee[n];
        
       
        for ( int i = 0; i < n; i++) {
       
            e[i] = new Employee(
            Hireable.generateEmployeeID(),
            Hireable.generateFName(),
            Hireable.generateLName(), 
            Hireable.generatePosition(),
            Hireable.generateDepartment(),
            Hireable.generateEmploymentStatDate()
            );
            
            
            
        }
        return e;
      }

    /**
     * Builds an array of PayRecord objects based on the given array of Employee objects.
     * 
     * @param e An array of Employee objects.
     * @return An array of PayRecord objects.
     */
    public static PayRecord[] buildPayRecords(Employee[] e) {   
        PayRecord[] PR = new PayRecord[e.length];
        
        for (int i=0;i<e.length;i++){ 
            PR[i]= new PayRecord(
                e[i].getEmployeeID(),
                Hireable.generateSalary(),
                Hireable.generatePayDate()
            );
        }
        return PR;
    }
}
