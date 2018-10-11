package com.fdmgroup.service;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

	public List<Basket> fruitInBasket = new ArrayList<Basket>();

	// Get all the items in the basket
	public List<Basket> getAllItems() {
		return this.fruitInBasket;
	}

	// Add items to the basket
	public void addItem(Basket checkoutItem) {
		fruitInBasket.add(checkoutItem);
	}

	// Add up the total number of items in basket
	public int totalItems() {
		int total = 0;
		for (int i = 0; i < fruitInBasket.size(); i++) {
			total += fruitInBasket.get(i).getQuantity();
		}
		return total;
	}

	// Total amount of the basket
	public double totalAmountOfBasket() {
		double totalAmount = 0.0d;
		int quantity = 0;
		double price = 0.0d;
		double totalAmountPerFruit = 0.0d;
		for (int i = 0; i < fruitInBasket.size(); i++) {
			quantity = fruitInBasket.get(i).getQuantity();
			price = fruitInBasket.get(i).getPrice();
			totalAmountPerFruit = quantity * price;
			totalAmount += totalAmountPerFruit;
		}
		return totalAmount;
	}

}
