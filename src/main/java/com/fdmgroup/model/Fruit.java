package com.fdmgroup.model;

public enum Fruit {
	APPLE("Apple", .50), ORANGE("Orange", .45), PEAR("Pear", .55), LEMON("Lemon", .30), BANANA("Banana", .50);

	private String fruitName = null;
	private double price = 0.0d;

	Fruit(String fruitName, double price) {
		this.fruitName = fruitName;
		this.price = price;
	}

	public String getfruitName() {
		return fruitName;
	}

	public void setNameOfFruit(String fruitName) {
		this.fruitName = fruitName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
