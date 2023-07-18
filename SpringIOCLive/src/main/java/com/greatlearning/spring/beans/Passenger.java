package com.greatlearning.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Passenger {
	
	@Autowired
	private CabDriver driver;
	private String passengerName;
	
	public Passenger(CabDriver driver, @Value("Arvind")String passengerName) {
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
