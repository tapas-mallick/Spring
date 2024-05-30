package com.springcore.lifecycle;

public class LifecycleTest {
	
	private double price;
	private String product;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting the price for LifecycleTest obj");
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
		System.out.println("Setting the product for LifecycleTest obj");
	}
	public LifecycleTest(double price, String product) {
		super();
		this.price = price;
		this.product = product;
	}
	public LifecycleTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LifecycleTest [price=" + price + ", product=" + product + "]";
	}
	
	
	public void init() {
		System.out.println("Inside init Method");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy Method");
	}
}
