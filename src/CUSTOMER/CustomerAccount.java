package CUSTOMER;

public class CustomerAccount extends Customer{
    private String CustomerID; // C-##-####
    private Enum<?> AccountStatus;
    private double AccountBalance;

    public CustomerAccount() {

    }

    public CustomerAccount(String CustomerID, Enum<?> AcountStatus, double AccountBalance) {
        this.CustomerID = CustomerID;
        this.AccountStatus = AccountStatus;
        this.AccountBalance = AccountBalance;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        CustomerID = this.CustomerID;
    }

    public Enum<?> getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(Enum<?> AccountStatus) {
        AccountStatus = this.AccountStatus;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double AccountBalance) {
        AccountBalance = this.AccountBalance;
    }

}
