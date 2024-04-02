package CUSTOMER;

/**
 * The JobScheduling class represents a job scheduling for a customer account.
 * It extends the CustomerAccount class.
 */
public class JobScheduling extends CustomerAccount {
    private String JobID; // C-##-####
    private String CustomerID; // C-##-####
    private String JobLocation;
    private String JobDate;
    private Double JobCost;

    /**
     * Constructs an empty JobScheduling object.
     */
    public JobScheduling() {
    }

    /**
     * Constructs a JobScheduling object with the specified parameters.
     *
     * @param JobID       the ID of the job
     * @param CustomerID  the ID of the customer
     * @param JobLocation the location of the job
     * @param JobDate     the date of the job
     * @param JobCost     the cost of the job
     */
    public JobScheduling(String JobID, String CustomerID, String JobLocation, String JobDate, Double JobCost) {
        this.JobID = JobID;
        this.CustomerID = CustomerID;
        this.JobLocation = JobLocation;
        this.JobDate = JobDate;
        this.JobCost = JobCost;
    }

    /**
     * Sets the ID of the job.
     *
     * @param jobID the ID of the job
     */
    public void setJobID(String jobID) {
        JobID = jobID;
    }

    /**
     * Returns the ID of the job.
     *
     * @return the ID of the job
     */
    public String getJobID() {
        return JobID;
    }

    /**
     * Returns the ID of the customer.
     *
     * @return the ID of the customer
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * Sets the ID of the customer.
     *
     * @param customerID the ID of the customer
     */
    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    /**
     * Returns the location of the job.
     *
     * @return the location of the job
     */
    public String getJobLocation() {
        return JobLocation;
    }

    /**
     * Sets the location of the job.
     *
     * @param jobLocation the location of the job
     */
    public void setJobLocation(String jobLocation) {
        JobLocation = jobLocation;
    }

    /**
     * Returns the date of the job.
     *
     * @return the date of the job
     */
    public String getJobDate() {
        return JobDate;
    }

    /**
     * Sets the date of the job.
     *
     * @param jobDate the date of the job
     */
    public void setJobDate(String jobDate) {
        JobDate = jobDate;
    }

    /**
     * Returns the cost of the job.
     *
     * @return the cost of the job
     */
    public Double getJobCost() {
        return JobCost;
    }

    /**
     * Sets the cost of the job.
     *
     * @param jobCost the cost of the job
     */
    public void setJobCost(Double jobCost) {
        JobCost = jobCost;
    }

    /**
     * Returns a string representation of the JobScheduling object.
     *
     * @return a string representation of the JobScheduling object
     */
    public String toString() {
        super.toString();
        return "*****JobScheduling***** \nCustomerID = " + CustomerID +
                "\nJobLocation = " + JobLocation +
                "\nJobDate = " + JobDate +
                "\nJobCost = " + JobCost + "\n";
    }

    /**
     * Returns an SQL statement for inserting the JobScheduling object into the database.
     *
     * @return an SQL statement for inserting the JobScheduling object into the database
     */
    public String toSql() {
        String sql = "INSERT INTO Job_Scheduling" +
                "(JobID, customerid, joblocation, jobdate, jobcost)" +
                "VALUES ('" +
                JobID + "','" +
                CustomerID + "', '" +
                JobLocation + "', '" +
                JobDate + "', '" +
                JobCost + "');";
        return sql;
    }

    /**
     * Displays the JobScheduling object.
     */
    public void displayMe() {
        System.out.println(toString());
    }
}
