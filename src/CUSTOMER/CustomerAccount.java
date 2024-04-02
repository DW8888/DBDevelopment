package CUSTOMER;

/**
 * The CustomerAccount class represents a customer account.
 * It extends the Customer class and contains information about the customer's ID, account status, and account balance.
 */
public class CustomerAccount extends Customer {
    private String CustomerID; // C-##-####
    private Enum<?> AccountStatus;
    private double AccountBalance;

    /**
     * Constructs a new CustomerAccount object with default values.
     */
    public CustomerAccount() {
    }

    /**
     * Constructs a new CustomerAccount object with the specified values.
     *
     * @param CustomerID     the customer ID
     * @param AccountStatus  the account status
     * @param AccountBalance the account balance
     */
    public CustomerAccount(String CustomerID, Enum<?> AccountStatus, double AccountBalance) {
        this.CustomerID = CustomerID;
        this.AccountStatus = AccountStatus;
        this.AccountBalance = AccountBalance;
    }

    /**
     * Returns the customer ID.
     *
     * @return the customer ID
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * Sets the customer ID.
     *
     * @param CustomerID the customer ID to set
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID; // Assigning parameter to instance variable
    }

    /**
     * Returns the account status.
     *
     * @return the account status
     */
    public Enum<?> getAccountStatus() {
        return AccountStatus;
    }

    /**
     * Sets the account status.
     *
     * @param AccountStatus the account status to set
     */
    public void setAccountStatus(Enum<?> AccountStatus) {
        this.AccountStatus = AccountStatus; // Assigning parameter to instance variable
    }

    /**
     * Returns the account balance.
     *
     * @return the account balance
     */
    public double getAccountBalance() {
        return AccountBalance;
    }

    /**
     * Sets the account balance.
     *
     * @param AccountBalance the account balance to set
     */
    public void setAccountBalance(double AccountBalance) {
        this.AccountBalance = AccountBalance; // Assigning parameter to instance variable
    }

    /**
     * Returns a string representation of the CustomerAccount object.
     *
     * @return a string representation of the object
     */
    public String toString() {
        return "***CustomerAccount*** \nCustomerID = "
                + CustomerID + "\nAccountStatus = "
                + AccountStatus + "\nAccountBalance = "
                + AccountBalance + "\n";
    }

    /**
     * Displays the CustomerAccount object.
     */
    public void displayMe() {
        System.out.println(toString());
    }

    /**
     * Returns the SQL statement for inserting the CustomerAccount object into the database.
     *
     * @return the SQL statement
     */
    public String toSql() {
        String sql = "INSERT INTO Customer_Account" +
                "(customerid, accountstatus, accountbalance)" +
                "VALUES ('" + CustomerID + "', '" +
                AccountStatus + "', '" +
                AccountBalance + "');";
        return sql;
    }
}
