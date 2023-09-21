package com.gqt.shoppingcart.electronics;


class Television extends Electronics{
	private String Brand;
	private int cost;
	private String resolution;
	private int screensize;
	private String modelname;
	
	public Television(String brand, int cost, String resolution, int screensize, String modelname) {
		super(brand, cost);
		Brand = brand;
		this.cost = cost;
		this.resolution = resolution;		
		this.screensize = screensize;
		this.modelname = modelname;
	}

    public String getBrand() {
		return Brand;
	}


	public int getCost() {
		return cost;
	}


	public String getResolution() {
		return resolution;
	}


	public int getScreensize() {
		return screensize;
	}


	public String getModelname() {
		return modelname;
	}
}
