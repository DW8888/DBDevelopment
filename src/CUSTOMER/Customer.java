package CUSTOMER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Interface.*;

public class Customer implements Identifiable {
    private String CustomerID;
    private String FName;
    private String LName;
    private String CustomerSince;

    private static int count;

    public Customer() {
        count++;
    }

    public Customer(String CustomerID, String FName, String LName, String CustomerSince) {
        this.CustomerID = CustomerID;
        this.FName = FName;
        this.LName = LName;
        this.CustomerSince = CustomerSince;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setCount(int count) {
        Customer.count = count;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getCustomerSince() {
        return CustomerSince;
    }

    public void setCustomerSince(String CustomerSince) {
        this.CustomerSince = CustomerSince;
    }

    // Method to insert customer data into the database
    public void insertIntoDatabase(Connection connection) throws SQLException {
        String query = "INSERT INTO customers (CustomerID, FName, LName, CustomerSince) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, CustomerID);
            statement.setString(2, FName);
            statement.setString(3, LName);
            statement.setString(4, CustomerSince);
            statement.executeUpdate();
        }
    }

    @Override
    public String toString() {
        return "***Customer Information***\n" +
                "Customer ID: " + CustomerID + "\n" +
                "First Name: " + FName + "\n" +
                "Last Name: " + LName + "\n" +
                "Customer Since: " + CustomerSince + "\n";
    }
    public void toSql(){
    String sql="INSERT INTO customers "+
        "(CustomerID, FName, LName, CustomerSince) VALUES " +
        "('" + CustomerID + "', '" +
         FName + "', '" +
         LName + "', '" +
         CustomerSince + "');";
    System.out.println(sql);   
    }
        
    public void displayMe() {
        System.out.println(toString());
    }
}
