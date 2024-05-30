package com.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		System.out.println("setter");
		this.address = address;
	}
	@Autowired
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
