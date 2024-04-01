package EMPLOYEE;

public class PayRecord {
    private String EmployeeID;
    private double Salary;
    private String Paydate;

    public PayRecord() {
    }  

    public PayRecord(String EmployeeID, double Salary, String Paydate) {
        this.EmployeeID = EmployeeID;
        this.Salary = Salary;
        this.Paydate = Paydate;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getPaydate() {
        return Paydate;
    }

    public void setPaydate(String paydate) {
        Paydate = paydate;
    }
    public String toString() {
        super.toString();
        return "****PayRecord**** \nEmployeeID = " + EmployeeID + 
        "\nSalary = " + Salary + "\nPaydate = " + Paydate + "\n";
    }

    public String toSql() {
        String sql = "INSERT INTO Pay_Record" +
                     "(employee_id, salary, paydate)" +
                     "VALUES ('" + EmployeeID + "', '" +
                     Salary + "', '" +
                     Paydate + "');";
       return sql;
    }   
    public void displayMe() {
        System.out.println(toString());
    }


    

}
