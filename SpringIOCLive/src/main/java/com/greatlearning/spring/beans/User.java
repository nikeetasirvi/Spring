package com.greatlearning.spring.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
public class User {
	
	private String name;
	private int age;
	private List<String> phoneNo;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public List<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@PostConstruct
	public void setup() {
		System.out.println("This method is called after the constructor has been called");
	}
	
	@PreDestroy
	public void tearDown() {
		System.out.println("This method is called before the object is garbage collected");
	}
}
