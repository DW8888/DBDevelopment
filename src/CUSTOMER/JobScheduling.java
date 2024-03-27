package CUSTOMER;

public class JobScheduling {
    private String JobID; // C-##-####
    private String CustomerID; // C-##-####
    private String JobLocation;
    private String JobDate;
    private Double JobCost;
    public JobScheduling() {
    }
    public JobScheduling(String CustomerID, String JobLocation, String JobDate, Double JobCost) {
        this.JobID = JobID;
        this.CustomerID = CustomerID;
        this.JobLocation = JobLocation;
        this.JobDate = JobDate;
        this.JobCost = JobCost;
    }
    public String getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }
    public String getJobLocation() {
        return JobLocation;
    }

    public void setJobLocation(String jobLocation) {
        JobLocation = jobLocation;
    }
    public void getJobDate(String jobDate) {
        JobDate = jobDate;
    }
    public void setJobDate(String jobDate) {
        JobDate = jobDate;
    } 
    public Double getJobCost() {
        return JobCost;
    }
    public void setJobCost(Double jobCost) {
        JobCost = jobCost;
    }
    public String toString() {
        super.toString();
        return "[JobScheduling \nCustomerID=" + CustomerID + 
        "\n JobLocation=" + JobLocation + 
        "\n JobDate=" + JobDate + 
        "\n JobCost=" + JobCost + "]";
    }   

}
