package EMPLOYEE;

public class Employee implements Interface.Identifiable {
    private String EmployeeID;
    private String FName;
    private String LName;
    private String Position;
    private String Department;
    private String EmployeeStartDate;
    private int count;

    /**
     * Default constructor for the Employee class.
     * Initializes the count variable.
     */
    public Employee() {
        count++;
    }

    /**
     * Parameterized constructor for the Employee class.
     * Initializes the Employee object with the provided values.
     *
     * @param EmployeeID          The ID of the employee.
     * @param FName               The first name of the employee.
     * @param LName               The last name of the employee.
     * @param Position            The position of the employee.
     * @param Department          The department of the employee.
     * @param EmployeeStartDate   The start date of the employee.
     */
    public Employee(String EmployeeID, String FName, String LName, String Position, String Department,
                    String EmployeeStartDate) {
        this.EmployeeID = EmployeeID;
        this.FName = FName;
        this.LName = LName;
        this.Position = Position;
        this.Department = Department;
        this.EmployeeStartDate = EmployeeStartDate;
    }

    /**
     * Retrieves the employee ID.
     *
     * @return The employee ID.
     */
    public String getEmployeeID() {
        return EmployeeID;
    }

    /**
     * Sets the employee ID.
     *
     * @param employeeID The employee ID to set.
     */
    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    /**
     * Retrieves the first name of the employee.
     *
     * @return The first name of the employee.
     */
    public String getFName() {
        return FName;
    }

    /**
     * Sets the first name of the employee.
     *
     * @param fName The first name to set.
     */
    public void setFName(String fName) {
        FName = fName;
    }

    /**
     * Retrieves the last name of the employee.
     *
     * @return The last name of the employee.
     */
    public String getLName() {
        return LName;
    }

    /**
     * Sets the last name of the employee.
     *
     * @param lName The last name to set.
     */
    public void setLName(String lName) {
        LName = lName;
    }

    /**
     * Retrieves the position of the employee.
     *
     * @return The position of the employee.
     */
    public String getPosition() {
        return Position;
    }

    /**
     * Sets the position of the employee.
     *
     * @param position The position to set.
     */
    public void setPosition(String position) {
        Position = position;
    }

    /**
     * Retrieves the department of the employee.
     *
     * @return The department of the employee.
     */
    public String getDepartment() {
        return Department;
    }

    /**
     * Sets the department of the employee.
     *
     * @param department The department to set.
     */
    public void setDepartment(String department) {
        Department = department;
    }

    /**
     * Retrieves the start date of the employee.
     *
     * @return The start date of the employee.
     */
    public String getEmployeeStartDate() {
        return EmployeeStartDate;
    }

    /**
     * Sets the start date of the employee.
     *
     * @param employeeStartDate The start date to set.
     */
    public void setEmployeeStartDate(String employeeStartDate) {
        EmployeeStartDate = employeeStartDate;
    }

    /**
     * Retrieves the count of Employee objects created.
     *
     * @return The count of Employee objects.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the count of Employee objects.
     *
     * @param count The count to set.
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Returns a string representation of the Employee object.
     *
     * @return A string representation of the Employee object.
     */
    public String toString() {
        super.toString();
        return "****Employee**** \nEmployeeID = " + EmployeeID +
                "\nFName = " + FName +
                "\nLName = " + LName +
                "\nPosition = " + Position +
                "\nDepartment = " + Department +
                "\nEmployeeStartDate = " + EmployeeStartDate + "\n";
    }

    /**
     * Returns an SQL statement for inserting the Employee object into a database.
     *
     * @return An SQL statement for inserting the Employee object.
     */
    public String toSql() {
        String sql = "INSERT INTO Employee" +
                "(employeeid, fname, lname, position, department, employmentstartdate)" +
                "VALUES ('" + EmployeeID + "', '" +
                FName + "', '" + LName + "', '" + Position + "', '" + Department + "', '" + EmployeeStartDate + "');";
        return sql;
    }

    /**
     * Displays the Employee object.
     */
    public void displayMe() {
        System.out.println(toString());
    }
}
