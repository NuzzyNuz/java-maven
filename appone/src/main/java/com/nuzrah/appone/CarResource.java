package com.nuzrah.appone;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.nuzrah.appone.model.Car;


@Path("cars")
public class CarResource {
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String test() {
//		return "Yes Working!";
//	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	//Response method for all data
	public Response getAll() {
		//Jackson - an alternative
		//GSON - much efficient, faster and stable
		
		//List<Car> cars = getCars();
		
		//List<Car> cars = getCarsFromDB();
		
		Object object = getCarsFromDB();
		
		Gson gson = new Gson();
		
		if(object instanceof List<?>) {
			@SuppressWarnings("unchecked")
			List<Car> cars = (List<Car>)object; //casting - datatype checking
			
			String jsonString = gson.toJson(cars);
			return Response
					.status(200)
					.entity(jsonString)
					.build();
			
			
		} else {
			@SuppressWarnings("unchecked")
			Map<String, String> errMsg = (HashMap<String, String>)object;
			
			String jsonString = gson.toJson(errMsg);
			return Response
					.status(200)
					.entity(jsonString)
					.build();
		}
		
//		Gson gson = new Gson();
//		String jsonString = gson.toJson(cars);
//		
//		return Response
//				.status(200)
//				.entity(jsonString)
//				.build();
	}
	
	//response method for single data 
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getACar(@PathParam("id") String id) {
		
		int carid = Integer.parseInt(id);
		
		Car car = getACarFromDB(carid);
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(car);
		
		return Response
				.status(200)
				.entity(jsonString)
				.build();
		
	}
	
	//post method of the form - addcars.jsp
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void addCar(	@FormParam("model") String model, 
							@FormParam("brand") String brand,
							@FormParam("year") String year,
							@FormParam("color") String color,
							@FormParam("type") String type) {
		
		//check log
		System.out.println("Model-->" + model);
		System.out.println("Brand-->" + brand);
		
	}
	
	//fetching data from database
	//public List<Car> getCarsFromDB(){
	public Object getCarsFromDB(){
		List<Car> carList = new ArrayList<Car>();
		
		String connURL = "jdbc:mysql://localhost:3306/cardb?serverTimezone=UTC";
		
		try {
			// getting the required drivers and connection establishment
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(connURL, "root", "");
			
			String sql = "SELECT * FROM tbl_car"; //Query to be executed			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
						
			ResultSet resultSet = preparedStatement.executeQuery(); //Query execution
			
			while(resultSet.next()) {
				Car car = new Car();
				car.setId(resultSet.getInt("id"));
				car.setModel(resultSet.getString("model"));
				car.setBrand(resultSet.getString("brand"));
				car.setYear(resultSet.getInt("year"));
				car.setColor(resultSet.getString("color"));
				car.setType(resultSet.getString("type"));
				
				//add the query to the car list
				carList.add(car);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
			//Debugging
			System.out.println("Error 1 : " + e.getMessage());
			
			//err msg is returned  if error otherwise the carList is returned
			Map<String, String> errMsg = new HashMap<String, String>();
			errMsg.put("Error", e.getMessage());
			
			return errMsg;
		}
		
		return carList;
	}
	
	//fetching a single record from database
	public Car getACarFromDB(int id){
		Car car = new Car();
		
		String connURL = "jdbc:mysql://localhost:3306/cardb?serverTimezone=UTC";
		
		try {
			// getting the required drivers and connection establishment
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(connURL, "root", "");
			
			String sql = "SELECT * FROM tbl_car WHERE id = ?"; //Query to be executed			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			
			//Binding the parameter value, 1 is for specifying the first parameter
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery(); //Query execution
			
			while(resultSet.next()) {
				car.setId(resultSet.getInt("id"));
				car.setModel(resultSet.getString("model"));
				car.setBrand(resultSet.getString("brand"));
				car.setYear(resultSet.getInt("year"));
				car.setColor(resultSet.getString("color"));
				car.setType(resultSet.getString("type"));
									
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
			//Debugging
			System.out.println("Error 2 : " + e.getMessage());
		}
		
		return car;
	}
	
	
	
	
////	Database Simulation cars.
//	public List<Car> getCars(){
//		List<Car> carList = new ArrayList<Car>();
//		
//		Car car1 = new Car(1, "5280", "BMW", 2020);
//		carList.add(car1);
//		
//		Car car2 = new Car(2, "Axio", "Toyota", 2020);
//		carList.add(car2);
//		
//		Car car3 = new Car(3, "A7", "Audi", 2020);
//		carList.add(car3);
//		
//		return carList;
//	}
	
	
}
