package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj") //Stereotype annotation
@Scope("prototype")  //Bean Scope can be defined using @Scope annotation or in XML file while creating the bean using Scope attribute
public class Student {
	@Value("Tapas Mallick")
	private String studentName;
	@Value("Bhubaneswar")
	private String address;
	@Value("#{temp}")
	private List<String> mobile;
	
	
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", address=" + address + "]";
	}
	
}
