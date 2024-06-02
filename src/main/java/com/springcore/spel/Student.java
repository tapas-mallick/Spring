package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("#{new java.lang.String('Tapas Mallick')}")
	private String name;
	@Value("#{50+20}")
	private int marks;
	@Value("#{T(java.lang.Math).sqrt(100)}")
	private double x;
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", x=" + x + ", pi=" + pi + "]";
	}
	
	
}
