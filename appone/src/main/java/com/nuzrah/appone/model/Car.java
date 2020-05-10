package com.nuzrah.appone.model;

public class Car {
	private int id;
	private String brand;
	private String model;
	private int year;
	private String color;
	private String type;
	
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String brand, String model, int year, String color, String type) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}

