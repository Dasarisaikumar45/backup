package com.ibm.shop;

public class Category {
	private Product[] products;
	private double total;
	private int idx;
	
	
	public Category() {
		products = new Product[5];
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	public void addToCart(Product p) throws ShoppingException{
		if(idx == products.length)
			throw new ShoppingException("Your cart is full!");
		else {
			products[idx ++]=p;
			total +=p.getPrice();
			System.out.println("Product added...");
		}
	}
	public void checkout() {
		System.out.println("products in your cart");
		for(int i=0; i<idx; i++)
			products[i].description();
		System.out.println("Cart Total: " + total);
	}
}