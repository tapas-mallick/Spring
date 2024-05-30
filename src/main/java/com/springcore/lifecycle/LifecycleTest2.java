package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleTest2 {
	
// Implement lifecycle method using Annotations (@PostConstruct , @PreDestroy) 
	private double price;
	private String product;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting the price for LifecycleTest2 obj");
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
		System.out.println("Setting the product for LifecycleTest2 obj");
	}
	public LifecycleTest2(double price, String product) {
		super();
		this.price = price;
		this.product = product;
	}
	public LifecycleTest2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LifecycleTest [price=" + price + ", product=" + product + "]";
	}
	@PostConstruct
	public void initMethod() {
		System.out.println("Inside initMethod");
	}
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Inside destroyMethod");
	}
	
}
