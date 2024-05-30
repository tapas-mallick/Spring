package com.springcore.autowiring.annotations;

public class Address {
	private String housenum;
	private String Street;
	private String city;
	public String getHousenum() {
		return housenum;
	}
	public void setHousenum(String housenum) {
		this.housenum = housenum;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [housenum=" + housenum + ", Street=" + Street + ", city=" + city + "]";
	}
}
