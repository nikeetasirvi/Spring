package com.greatlearning.spring.beans;

public class Passenger {
	
	private CabDriver driver;
	private String passengerName;
	
	public Passenger(CabDriver driver, String passengerName) {
		this.driver = driver;
		this.passengerName = passengerName;
	}

	public void commute(String from,String destination) {
		this.driver.trip(from,destination);
	}
	
	public void printDetails() {
		System.out.println("The passenger name is " +passengerName);
		System.out.println("The Driver name is " +this.driver.getName());
		System.out.println("The Driver phoneNumber is " +this.driver.getPhoneNumber());
	}
}
