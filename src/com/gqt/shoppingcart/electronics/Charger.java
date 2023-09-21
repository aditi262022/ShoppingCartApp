package com.gqt.shoppingcart.electronics;

class Charger extends Electronics{
	private String Brand;
	private String watts;
	private int cost;
	private String type;
	private String devices;
	
	public Charger(String brand, String color, int cost, String type, String devices) {
		super(brand, cost);
		Brand = brand;
		this.watts = color;
		this.cost = cost;
		this.type = type;
		this.devices = devices;
	}

	public String getBrand() {
		return Brand;
	}

	public String getWatts() {
		return watts;
	}

	public int getCost() {
		return cost;
	}

	public String getType() {
		return type;
	}

	public String getDevices() {
		return devices;
	}
}
