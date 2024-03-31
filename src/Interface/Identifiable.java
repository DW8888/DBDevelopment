package Interface;


import java.util.Random;
import CUSTOMER.*;
import Enums.*;
import AIRCRAFT.*;


public interface Identifiable {
  
    public static String[] firstNames = { "Angella", "Bella", "Carmen", "Diana", "Elena", "Fiona",
            "Gina", "Hannah", "Irene", "Julia", "Kathy", "Linda", "Mona", "Nina",
            "Olivia", "Pamela", "Quinn", "Rita", "Samantha", "Tina", "Ursula",
            "Vicky", "Wendy", "Xena", "Yvonne", "Zara", "Arron", "Bobby", "Curtis", "Derek", "Ethan", "Frank", "George",
            "Henry", "Ivan", "John", "Kevin", "Liam", "Mason", "Nathan", "Oscar", "Peter", "Quinn", "Robert",
            "Steven", "Tom", "Ulysses", "Victor", "William", "Xavier", "Yan", "Zachary" };
    public static String[] lastNames = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
            "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia",
            "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young",
            "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green",
            "Adams", "Baker", "Gonzalez", "Sanchez", "Nieves", "Chavez", "Rivera", "Torres", "Ramirez", "Cruz", "Diaz",
            "Ortiz", "Gomez", "Mendez", "Perez", "Vasquez", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez",
            "Lewis", };
    public static String[] Locations={"Site 1","Site 2","Site 3","Site 4","Site 5","Site 6"};
    Random R = new Random();
    

    public static String generateFName() {
        String fName = firstNames[R.nextInt(firstNames.length)];
        return fName;
    }

    public static String generateLName() {
        String lNameName = lastNames[R.nextInt(lastNames.length)];
        return lNameName;
    }

    public static String generateCustomerSince() {
        String CustomerSince = null;
        int year = 2021 + R.nextInt(4);
        int month = 1 + R.nextInt(12);
        int day = 1 + R.nextInt(2);
        CustomerSince = year + "-" + month + "-" + day;
        return CustomerSince;
    }
    public static String generateCustomerID() {
        String CustomerID = "C-" + R.nextInt(100) + "-" + R.nextInt(10000);
        return CustomerID;
    }
    
public static AccountStatus generateAccountStatus() {
    AccountStatus A_S = AccountStatus.values()[R.nextInt(AccountStatus.values().length)];
    return A_S;
}
public static double generateAccountBalance() {
    double AccountBalance = 0.0 + R.nextDouble() * 1000.0;
    return AccountBalance;
}
public static String generatejobID() {
    String JobID = "J-" + R.nextInt(100) + "-" + R.nextInt(10000);
    return JobID;
}

public static String generateJobLocation(){
    return Locations[R.nextInt(Locations.length)];

}
public static String generateJobID()
{
    String JobID = "J-" + R.nextInt(100) + "-" + R.nextInt(10000);
    return JobID;

}
public static String generateJobDate() {
    String JobDate = null;
    int year = 2024 ;// lets only schedule jobs for the current year (2024
    int month = 1 + R.nextInt(12);
    int day = 1 + R.nextInt(2);
    JobDate = year + "-" + month + "-" + day;
    return JobDate;

}
public static double generateJobCost() {
    double JobCost = 0.0 + R.nextDouble() * 1000.0;
    return JobCost;
}
}