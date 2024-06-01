package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

	
	private List<String> friends;
	private Map<String,Integer> feeStructure;
	private Properties props;

	public Properties getProps() {
		return props;
	}
	@Autowired
	@Qualifier("person")
	public void setProps(Properties props) {
		this.props = props;
	}
	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}
	@Autowired
	@Qualifier("fees")
	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	public List<String> getFriends() {
		return friends;
	}
	@Autowired
	@Qualifier("person")
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", props=" + props + "]";
	}

	
	
}
