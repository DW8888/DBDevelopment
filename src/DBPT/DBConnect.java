import CUSTOMER.CustomerAccount;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnect{
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/CropDusting_DB";
    private static final String USER = "root";
    private static final String PASSWORD = "Gavin";
    // JDBC variables for opening and managing connection
    private static Connection connection;
    private static PreparedStatement statement;

    public static void main(String[] args) {
        try {
            // Establish a connection to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Prepare a SQL statement to insert data into the database
            String sql = "INSERT INTO Customer_Account (customer_id, account_status, account_balance) VALUES (?, ?, ?)";
            statement = connection.prepareStatement(sql);

//          
//            statement.setString(1, .getCustomerID());
//            statement.setString(2, .getAccountStatus().toString()); // Assuming AccountStatus is an enum
//            statement.setDouble(3, .getAccountBalance());

            // Execute the SQL statement
            statement.executeUpdate();

            System.out.println("Data inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connection and statement to release resources
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
