package Factory;
import EMPLOYEE.*;
import Interface.*;


public class EmployeeBuilder {
    Employee[] e; PayRecord[] PR; 

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
            public static PayRecord[] buildPayRecords(Employee[] e) {   
                PayRecord[] PR = new PayRecord[e.length];
                // Declare and initialize the 'e' array variable
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
