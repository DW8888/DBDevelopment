package CUSTOMER;
import Interface.*;

/**
 * The Customer class represents a customer in a system.
 * It implements the Identifiable interface.
 */
public class Customer implements Identifiable {
    private String CustomerID;
    private String FName;
    private String LName;
    private String CustomerSince;

    private static int count;

    /**
     * Constructs a new Customer object with default values.
     * The count of customers is incremented.
     */
    public Customer() {
        count++;
    }

    /**
     * Constructs a new Customer object with the specified values.
     * The count of customers is incremented.
     *
     * @param CustomerID     the customer ID
     * @param FName          the first name
     * @param LName          the last name
     * @param CustomerSince  the customer since date
     */
    public Customer(String CustomerID, String FName, String LName, String CustomerSince) {
        this.CustomerID = CustomerID;
        this.FName = FName;
        this.LName = LName;
        this.CustomerSince = CustomerSince;
        count++;
    }

    /**
     * Gets the count of customers.
     *
     * @return the count of customers
     */
    public static int getCount() {
        return count;
    }

    /**
     * Sets the count of customers.
     *
     * @param count the count of customers
     */
    public void setCount(int count) {
        Customer.count = count;
    }

    /**
     * Gets the customer ID.
     *
     * @return the customer ID
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * Sets the customer ID.
     *
     * @param CustomerID the customer ID
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFName() {
        return FName;
    }

    /**
     * Sets the first name.
     *
     * @param FName the first name
     */
    public void setFName(String FName) {
        this.FName = FName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLName() {
        return LName;
    }

    /**
     * Sets the last name.
     *
     * @param LName the last name
     */
    public void setLName(String LName) {
        this.LName = LName;
    }

    /**
     * Gets the customer since date.
     *
     * @return the customer since date
     */
    public String getCustomerSince() {
        return CustomerSince;
    }

    /**
     * Sets the customer since date.
     *
     * @param CustomerSince the customer since date
     */
    public void setCustomerSince(String CustomerSince) {
        this.CustomerSince = CustomerSince;
    }

    /**
     * Returns a string representation of the Customer object.
     *
     * @return a string representation of the Customer object
     */
    @Override
    public String toString() {
        return "***Customer Information***\n" +
                "Customer ID: " + CustomerID + "\n" +
                "First Name: " + FName + "\n" +
                "Last Name: " + LName + "\n" +
                "Customer Since: " + CustomerSince + "\n";
    }

    /**
     * Returns the SQL statement to insert customer data into the database.
     *
     * @return the SQL statement
     */
    public String toSql() {
        String sql = "INSERT INTO customer " +
                "(CustomerID, FName, LName, CustomerSince) VALUES " +
                "('" + CustomerID + "', '" +
                FName + "', '" +
                LName + "', '" +
                CustomerSince + "');";
        return sql;
    }

    /**
     * Displays the customer information.
     */
    public void displayMe() {
        System.out.println(toString());
    }
}
