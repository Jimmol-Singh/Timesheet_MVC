package coreservlets;

import java.sql.*;

public class MyDButil implements AutoCloseable{
	private static Connection connection;
	private ResultSet resultset;
	
	// Open Connection to database
	public void connectDB(String uID, String passWord){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("JDBC Driver loaded. Connecting to database....");
			connection = DriverManager.getConnection("jdbc:sqlserver://s16988308.onlinehome-server.com;"
					+ "databaseName=CUNY_DB;integratedSecurity=false;", uID,passWord);
			System.out.println("Database Connected.");
		}catch(ClassNotFoundException | SQLException ex){
			ex.printStackTrace();
		}
	}
	
	// Run Query to get result set
	public ResultSet getQuery(String query, String uID, String passWord) throws SQLException, ClassNotFoundException {
		
		try{
			connectDB(uID, passWord);
			Statement statement = connection.createStatement();
			resultset = statement.executeQuery(query);
		}catch(SQLException ex){
			ex.getMessage();
			ex.printStackTrace();
		}
		
		return resultset;
	}
	
	
	
	// Insert values into database
	public void updateValues(String table, String query, String uID, String passWord)throws SQLException, ClassNotFoundException {
		
		try{
			connectDB(uID, passWord);
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
		}catch(SQLException ex){
			ex.getMessage();
			ex.printStackTrace();
		}
		
	}
	
	// Closes database connection
	public void closeConn() throws SQLException{
		connection.close();
	}

	@Override
	public void close() throws SQLException {
		connection.close();
	}
}