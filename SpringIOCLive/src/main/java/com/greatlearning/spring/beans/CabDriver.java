package com.greatlearning.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CabDriver {
	
	private String phoneNumber;
	private String name;
	
	public CabDriver(@Value("sudheer")String phoneNumber,@Value("4444444444") String name) {
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void trip(String from, String destination) {
		System.out.println("Commuting from " +from+ " to " +destination);
	}
}
