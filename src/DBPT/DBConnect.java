package DBPT;

import java.sql.*;

/**
 * The DBConnect class provides methods for connecting to a MySQL database,
 * executing queries, and preparing statements.
 */
public class DBConnect {
    
    private static final String jdbc_url = "jdbc:mysql://localhost:3308/";
    private static final String username = "root";
    private static final String password = "Gavin";
    
    /**
     * Connects to the specified database.
     * 
     * @param database the name of the database to connect to
     * @return a Connection object representing the database connection
     * @throws ClassNotFoundException if the MySQL JDBC driver is not found
     * @throws SQLException if a database access error occurs
     */
    public static Connection connectToDB(String database) throws ClassNotFoundException, 
            SQLException{
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection dbConnect = DriverManager.getConnection(jdbc_url, username, password);
       System.out.println("Connected to the " + database + " database");
       return dbConnect;
    }
    
    /**
     * Switches to the specified database.
     * 
     * @param conn the Connection object representing the database connection
     * @param query the SQL query to execute
     * @throws ClassNotFoundException if the MySQL JDBC driver is not found
     * @throws SQLException if a database access error occurs
     */
    public static void switchToDB(Connection conn,String query) throws ClassNotFoundException,
            SQLException{
       Statement state = conn.createStatement();
       state.execute(query);
    }
    
    /**
     * Executes a query and returns the result set.
     * 
     * @param query the SQL query to execute
     * @param database the name of the database to execute the query on
     * @return a ResultSet object representing the result of the query
     * @throws ClassNotFoundException if the MySQL JDBC driver is not found
     * @throws SQLException if a database access error occurs
     */
    public static ResultSet executeResultsQuery(String query,String database) throws ClassNotFoundException, 
            SQLException{
       Connection conn = connectToDB(database);
       switchToDB(conn,"USE " + database);
       Statement state = conn.createStatement();
       ResultSet rs = state.executeQuery(query);
       return rs;
    }
    
    /**
     * Executes a query.
     * 
     * @param query the SQL query to execute
     * @param conn the Connection object representing the database connection
     * @throws ClassNotFoundException if the MySQL JDBC driver is not found
     * @throws SQLException if a database access error occurs
     */
    public static void executeQuery(String query,Connection conn)throws ClassNotFoundException, SQLException{
        // Implementation goes here
    }

    /**
     * Prepares and executes a statement.
     * 
     * @param sql the SQL statement to prepare and execute
     * @param database the name of the database to execute the statement on
     * @throws SQLException if a database access error occurs
     * @throws ClassNotFoundException if the MySQL JDBC driver is not found
     */
    public static void prepareStatement(String sql, String database) throws SQLException, ClassNotFoundException{
        Connection conn = connectToDB(database);
        switchToDB(conn,"USE " + database);
        PreparedStatement  ps = conn.prepareStatement(sql);
        ps.executeUpdate();
        System.out.println("Statement executed");
    }
}