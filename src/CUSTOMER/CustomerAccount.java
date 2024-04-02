package CUSTOMER;

public class CustomerAccount extends Customer {
    private String CustomerID; // C-##-####
    private Enum<?> AccountStatus;
    private double AccountBalance;

    public CustomerAccount() {
    }

    public CustomerAccount(String CustomerID, Enum<?> AccountStatus, double AccountBalance) {
        this.CustomerID = CustomerID;
        this.AccountStatus = AccountStatus;
        this.AccountBalance = AccountBalance;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID; // Assigning parameter to instance variable
    }

    public Enum<?> getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(Enum<?> AccountStatus) {
        this.AccountStatus = AccountStatus; // Assigning parameter to instance variable
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double AccountBalance) {
        this.AccountBalance = AccountBalance; // Assigning parameter to instance variable
    }
    public String toString() {
        return "***CustomerAccount*** \nCustomerID = "
                + CustomerID + "\nAccountStatus = "
                + AccountStatus + "\nAccountBalance = "
                + AccountBalance +"\n";
    }
    public void displayMe() {
        System.out.println(toString());
    }   

    public String toSql() {
        String sql = "INSERT INTO Customer_Account" +
                     "(customerid, accountstatus, accountbalance)" +
                     "VALUES ('" + CustomerID + "', '" +
                     AccountStatus + "', '" +
                     AccountBalance + "');";
        return sql;
    }
}
