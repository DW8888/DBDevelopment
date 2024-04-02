package DBPT;

import java.sql.*;


public class DBConnect {
    
    private static final String jdbc_url = "jdbc:mysql://localhost:3308/";
    private static final String username = "root";
    private static final String password = "Gavin";
    
    public static Connection connectToDB(String database) throws ClassNotFoundException, 
            SQLException{
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection dbConnect = DriverManager.getConnection(jdbc_url, username, password);
       System.out.println("Connected to the " + database + " database");
       return dbConnect;
    }
    
    public static void switchToDB(Connection conn,String query) throws ClassNotFoundException,
            SQLException{
       Statement state = conn.createStatement();
       state.execute(query);
    }
    
    public static ResultSet executeResultsQuery(String query,String database) throws ClassNotFoundException, 
            SQLException{
       Connection conn = connectToDB(database);
       switchToDB(conn,"USE " + database);
       Statement state = conn.createStatement();
       ResultSet rs = state.executeQuery(query);
       return rs;
    }
    /**
     * @param query
     * @param conn
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void executeQuery(String query,Connection conn)throws ClassNotFoundException, SQLException{
        
       
   
      
    
    }

    public static void prepareStatement(String sql, String database) throws SQLException, ClassNotFoundException{
        Connection conn = connectToDB(database);
        switchToDB(conn,"USE " + database);
        PreparedStatement  ps = conn.prepareStatement(sql);
        ps.executeUpdate();
        System.out.println("Statement executed");
       
   
        
       
    }
}