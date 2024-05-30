package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String empName;
	private List<String> mobileNum;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties database;

	public Properties getDatabase() {
		return database;
	}

	public void setDatabase(Properties database) {
		this.database = database;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(List<String> mobileNum) {
		this.mobileNum = mobileNum;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Employee(String empName, List<String> mobileNum, Set<String> address, Map<String, String> courses,
			Properties database) {
		super();
		this.empName = empName;
		this.mobileNum = mobileNum;
		this.address = address;
		this.courses = courses;
		this.database = database;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
