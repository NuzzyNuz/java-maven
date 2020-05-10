package com.nuzrah.appone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.nuzrah.appone.model.User;

@Path("users")
public class UserResource {
	
//	//Checking if it works 
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getAllUsers() {
//		return "Users will be here";
//	}
	
	//to get the JSON from the array below
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllUsers() {
		List<User> users = getUsers();
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(users);
		
		return Response
				.status(200)
				.entity(jsonString)
				.build();
	}
	
	@GET
	//get record by the array index number - not the id number
	@Path("id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response fetchUsers(@PathParam("id") int id) {
		try {
			List<User> users = getUsers();
			
			User user = users.get(id);
			
			Gson gson = new Gson();
			
			
			String jsonString = gson.toJson(user);
			
			return Response
					.status(200)
					.entity(jsonString)
					.build();
			
			
		} catch (Exception e) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("MESSAGE", "No Record Found!"+e.getMessage());
			Gson gson = new Gson();
			String jsonString = gson.toJson(map);
			
			return Response
					.status(200)
					.entity(jsonString)
					.build();			
		}
		
	}
	
	
	//Database Simulation user.
	public List<User> getUsers(){
		List<User> userList = new ArrayList<User>();
		
		User user = new User(0, "Jon", "jon@bcas.lk", "123", "ADMIN");
		userList.add(user);
		
		User user1 = new User(1, "Anne", "anne@bcas.lk", "123", "STANDARD");
		userList.add(user1);
		
		User user2 = new User(2, "Sam", "sam@bcas.lk", "123", "STANDARD");
		userList.add(user2);
		
		return userList;
	}
}
