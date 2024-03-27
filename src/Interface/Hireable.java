package Interface;

public interface Hireable extends Identifiable {
    String[] Positions = {"PILOT", "GROUND_CREW", "MECHANIC", "STAFF"};
    String[] Departments = {"Flight", "Management", "Maintenance"};

    public static String generatePosition() {
        String Position = Positions[R.nextInt(Positions.length)];
        return Position;
    }
    public static String generateDepartment() {
        String Department = Departments[R.nextInt(Departments.length)];
        return Department;
    }
    public static String generateEmployeeID() {
        String CustomerID = "E-" + R.nextInt(100) + "-" + R.nextInt(10000);
        return CustomerID;
    }
    public static String generateEmploymentStatDate() {
        String CustomerSince = null;
        int year = 2021 + R.nextInt(4);
        int month = 1 + R.nextInt(12);
        int day = 1 + R.nextInt(2);
        CustomerSince = year + "-" + month + "-" + day;
        return CustomerSince;
    }
    public static String generateFName() {
        String fName = firstNames[R.nextInt(firstNames.length)];
        return fName;
    }
    public static String generateLName() {
        String lNameName = lastNames[R.nextInt(lastNames.length)];
        return lNameName;
    }
    public static double generateSalary() {
        double Salary = 0.0 + R.nextDouble() * 1000.0;
        return Salary;
    }
    public static String generatePayDate(){
        String PayDate = null;
        int year = 2021 + R.nextInt(4);
        int month = 1 + R.nextInt(12);
        int day = 1 + R.nextInt(2);
        PayDate = year + "-" + month + "-" + day;
        return PayDate;
    }

    


}
