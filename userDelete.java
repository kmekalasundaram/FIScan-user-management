package com.fiscan.usermanagement.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class userDelete {
	  
public static boolean deleteUser (String firstName) {
	boolean rsdel = false;	
	Connection connect = null;
	Statement statement = null;
	ResultSet resultset = null;

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
	      String sql_query = "DELETE FROM Userdetail WHERE firstname = " + "'" + firstName + "'";
	      
	       resultset = statement.executeQuery(sql_query);
	       connect.close();
	    } 
		catch (SQLException e) {
	        e.printStackTrace();
	    }
		catch (Exception e) {
			e.printStackTrace();
		}
		if (resultset != null)
		{
			return rsdel == true;
		} else
		{
			return rsdel == false;
		}
	}
}

