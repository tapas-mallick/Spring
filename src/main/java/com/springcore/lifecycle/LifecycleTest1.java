package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifecycleTest1 implements InitializingBean,DisposableBean {
	
	private double price;
	private String product;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting the price for LifecycleTest1 obj");
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
		System.out.println("Setting the product for LifecycleTest1 obj");
	}
	public LifecycleTest1(double price, String product) {
		super();
		this.price = price;
		this.product = product;
	}
	public LifecycleTest1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LifecycleTest [price=" + price + ", product=" + product + "]";
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Destroy method");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside init method");
		
	}
	
	

}
