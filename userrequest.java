package com.fiscan.usermanagement;

import java.sql.ResultSet;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

import com.fiscan.usermanagement.resources.userAdd;
import com.fiscan.usermanagement.resources.userDelete;
import com.fiscan.usermanagement.resources.userdisplay;

@Path("/userreq")
public class userrequest {
	
	String firstname;
	String lastname;
	int dob;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ResultSet getuser() {
	
	 	return userdisplay.getallUser();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String adduser() {
		
		userAdd.postUser (firstname, lastname, dob);
		return "User added!!";
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteuser() {
		boolean recdel = false;
		userDelete.deleteUser (firstname);
		if (recdel == true)
		{
			return "User deleted from database";
		}
		else
		{
			return "User not deleted from database";
		}
	}
}