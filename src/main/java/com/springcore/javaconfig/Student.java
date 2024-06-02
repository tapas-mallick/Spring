package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("Tapas Mallick")
	private String name;

	@Value("Bhubaneswar")
	private String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void tapas(){
		System.out.println("my name is tapas");
	}
	
}
