package EMPLOYEE;

public class Employee implements Interface.Identifiable{
    private String EmployeeID;
    private String FName;
    private String LName;
    private String Position;
    private String Department;
    private String EmployeeStartDate;
    private int count;

    public Employee() {
        count++;
    }

    public Employee(String EmployeeID, String FName, String LName, String Position, String Department,
            String EmployeeStartDate) {
        this.EmployeeID = EmployeeID;
        this.FName = FName;
        this.LName = LName;
        this.Position = Position;
        this.Department = Department;
        this.EmployeeStartDate = EmployeeStartDate;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String fName) {
        FName = fName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String lName) {
        LName = lName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getEmployeeStartDate() {
        return EmployeeStartDate;
    }

    public void setEmployeeStartDate(String employeeStartDate) {
        EmployeeStartDate = employeeStartDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        super.toString();
        return "****Employee**** \nEmployeeID = " + EmployeeID +
        "\nFName = " + FName + 
                "\nLName = " + LName + 
        "\nPosition = " + Position + 
                "\nDepartment = " + Department +
         "\nEmployeeStartDate = " + EmployeeStartDate + "\n";

}
public void toSql() {
    String sql = "INSERT INTO Employee" +
                 "(employee_id, first_name, last_name, position, department, employee_start_date)" +
                 "VALUES ('" + EmployeeID + "', '" +
                 FName + "', '" + LName + "', '" + Position + "', '" + Department + "', '" + EmployeeStartDate + "');";
    System.out.println(sql);
}
   
public void displayMe() {
    System.out.println(toString());
}
}
