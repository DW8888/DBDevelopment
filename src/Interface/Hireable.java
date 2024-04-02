package Interface;

/**
 * The Hireable interface represents an entity that can be hired.
 * It extends the Identifiable interface.
 */
public interface Hireable extends Identifiable {
    /**
     * An array of available positions.
     */
    String[] Positions = {"PILOT", "GROUND_CREW", "MECHANIC", "STAFF"};

    /**
     * An array of available departments.
     */
    String[] Departments = {"Flight", "Management", "Maintenance"};

    /**
     * Generates a random position from the Positions array.
     * 
     * @return A randomly generated position.
     */
    public static String generatePosition() {
        String Position = Positions[R.nextInt(Positions.length)];
        return Position;
    }

    /**
     * Generates a random department from the Departments array.
     * 
     * @return A randomly generated department.
     */
    public static String generateDepartment() {
        String Department = Departments[R.nextInt(Departments.length)];
        return Department;
    }

    /**
     * Generates a random employee ID.
     * 
     * @return A randomly generated employee ID.
     */
    public static String generateEmployeeID() {
        String EmployeeID = "E-" + R.nextInt(100) + "-" + R.nextInt(10000);
        return EmployeeID;
    }

    /**
     * Generates a random employment start date.
     * 
     * @return A randomly generated employment start date.
     */
    public static String generateEmploymentStatDate() {
        String EmploymentStartDate = null;
        int year = 2021 + R.nextInt(4);
        int month = 1 + R.nextInt(12);
        int day = 1 + R.nextInt(2);
        EmploymentStartDate = year + "-" + month + "-" + day;
        return EmploymentStartDate;
    }

    /**
     * Generates a random first name.
     * 
     * @return A randomly generated first name.
     */
    public static String generateFName() {
        String fName = firstNames[R.nextInt(firstNames.length)];
        return fName;
    }

    /**
     * Generates a random last name.
     * 
     * @return A randomly generated last name.
     */
    public static String generateLName() {
        String lName = lastNames[R.nextInt(lastNames.length)];
        return lName;
    }

    /**
     * Generates a random salary.
     * 
     * @return A randomly generated salary.
     */
    public static double generateSalary() {
        double Salary = 0.0 + R.nextDouble() * 1000.0;
        return Salary;
    }

    /**
     * Generates a random pay date.
     * 
     * @return A randomly generated pay date.
     */
    public static String generatePayDate(){
        String PayDate = null;
        int year = 2021 + R.nextInt(4);
        int month = 1 + R.nextInt(12);
        int day = 1 + R.nextInt(2);
        PayDate = year + "-" + month + "-" + day;
        return PayDate;
    }
}
