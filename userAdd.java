package com.fiscan.usermanagement.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class userAdd {
	
	
	  
public static void postUser (String firstname, String lastname, int dob) {
		
	Connection connect = null;
	Statement statement = null;

	
	final String host = "localhost:8080";
	final String user = "xxxxxxxx";
	final String passwd = "xxxxxxxxxxx";

	try {
	      
		Class.forName("com.mysql.jdbc.Driver");
	     
	      //installed server on my computer, so host is localhost. Since for testing and localhost, we can also remove authentication option
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/userdetail?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();
	      
	      // query to update the user in the table Userdetail
	      String sql_query = "INSERT INTO Userdetail values " + firstname + "," + lastname + "," + "dob";
	      
	      statement.executeUpdate(sql_query);
	    } 
		catch (SQLException e) {
	        e.printStackTrace();
	    }
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

