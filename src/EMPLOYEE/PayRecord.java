package EMPLOYEE;

/**
 * The PayRecord class represents a record of an employee's pay.
 */
public class PayRecord {
    private String EmployeeID;
    private double Salary;
    private String Paydate;

    /**
     * Constructs an empty PayRecord object.
     */
    public PayRecord() {
    }  

    /**
     * Constructs a PayRecord object with the specified employee ID, salary, and pay date.
     * 
     * @param EmployeeID the employee ID
     * @param Salary the salary
     * @param Paydate the pay date
     */
    public PayRecord(String EmployeeID, double Salary, String Paydate) {
        this.EmployeeID = EmployeeID;
        this.Salary = Salary;
        this.Paydate = Paydate;
    }

    /**
     * Returns the employee ID.
     * 
     * @return the employee ID
     */
    public String getEmployeeID() {
        return EmployeeID;
    }

    /**
     * Sets the employee ID.
     * 
     * @param employeeID the employee ID to set
     */
    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    /**
     * Returns the salary.
     * 
     * @return the salary
     */
    public double getSalary() {
        return Salary;
    }

    /**
     * Sets the salary.
     * 
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        Salary = salary;
    }

    /**
     * Returns the pay date.
     * 
     * @return the pay date
     */
    public String getPaydate() {
        return Paydate;
    }

    /**
     * Sets the pay date.
     * 
     * @param paydate the pay date to set
     */
    public void setPaydate(String paydate) {
        Paydate = paydate;
    }

    /**
     * Returns a string representation of the PayRecord object.
     * 
     * @return a string representation of the PayRecord object
     */
    public String toString() {
        super.toString();
        return "****PayRecord**** \nEmployeeID = " + EmployeeID + 
        "\nSalary = " + Salary + "\nPaydate = " + Paydate + "\n";
    }

    /**

     * 
     * @return an SQL statement for inserting the PayRecord object into a database
     */
    public String toSql() {
        String sql = "INSERT INTO Pay_Record" +
                     "(employeeid, salary, paydate)" +
                     "VALUES ('" + EmployeeID + "', '" +
                     Salary + "', '" +
                     Paydate + "');";
       return sql;
    }   

    /**
     * Displays the PayRecord object.
     */
    public void displayMe() {
        System.out.println(toString());
    }
}
