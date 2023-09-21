package com.gqt.shoppingcart.HomeAppliances;

public class AirFryer {
	private String Brand;
	private String color;
	private int cost;
	private String capacity;
	private String voltage;

	public AirFryer(String brand, int cost, String color, String capacity, String voltage) {
		super();
		Brand = brand;
		this.color = color;
		this.cost = cost;
		this.capacity = capacity;
		this.voltage = voltage;
	}

	public String getBrand() {
		return Brand;
	}

	public String getColor() {
		return color;
	}

	public int getCost() {
		return cost;
	}

	public String getCapacity() {
		return capacity;
	}

	public String getVoltage() {
		return voltage;
	}

}

