package com.gqt.shoppingcart.electronics;

class Bulb extends Electronics{
	private String Brand;
	private String watts;
	private int cost;
	private String type;
	private String usage;
	
	public Bulb(String brand, String watts, int cost, String type, String usage) {
		super(brand, cost);
		Brand = brand;
		this.watts = watts;
		this.cost = cost;
		this.type = type;
		this.usage = usage;
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

	public String getUsage() {
		return usage;
	}	
}
