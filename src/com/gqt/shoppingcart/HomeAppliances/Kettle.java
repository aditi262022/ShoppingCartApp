package com.gqt.shoppingcart.HomeAppliances;

class Kettle extends HomeAppliances1
{
	private String Brand;
	private String color;
	private int cost;
	private String capacity;
	private String voltage;
	
	public Kettle(String brand, int cost, String color, String capacity, String voltage) {
		super(brand, cost);
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
