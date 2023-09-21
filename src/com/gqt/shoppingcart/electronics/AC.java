package com.gqt.shoppingcart.electronics;

class AC extends Electronics{
	private String Brand;
	private int cost;
	private String capacity;
	private int star;
	private String voltage;
	
	public AC(String brand, String capacity, int cost, int star, String voltage) {
		super(brand, cost);
		Brand = brand;
		this.capacity = capacity;
		this.cost = cost;
		this.star = star;
		this.voltage = voltage;
	}

    public String getBrand() {
		return Brand;
	}


	public int getCost() {
		return cost;
	}


	public String getCapacity() {
		return capacity;
	}


	public int getStar() {
		return star;
	}


	public String getVoltage() {
		return voltage;
	}
}
