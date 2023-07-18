package com.greatlearning.spring.beans;

public class CabDriver {
	
	private String phoneNumber;
	private String name;
	
	public CabDriver(String phoneNumber, String name) {
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
