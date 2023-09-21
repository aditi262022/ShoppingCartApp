package com.gqt.shoppingcart.electronics;

class Mobile extends Electronics{
	private String Brand;
	private String color;
	private int cost;
	private String sizeName;
	private String screenSize;
	
	public Mobile(String brand, String color, int cost, String sizeName, String screenSize) {
		super(brand, cost);
		Brand = brand;
		this.color = color;
		this.cost = cost;
		this.sizeName = sizeName;
		this.screenSize = screenSize;
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

	public String getSizeName() {
		return sizeName;
	}

	public String getScreenSize() {
		return screenSize;
	}	
}