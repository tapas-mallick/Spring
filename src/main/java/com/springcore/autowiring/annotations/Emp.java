package com.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")  // Qualifier annotation can be used to define which bean needs to be injected
	private Address address;

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("setter");
		this.address = address;
	}
	public Emp(Address address) {
		
		super();
		this.address = address;
		System.out.println("constructor");
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}


	
}
