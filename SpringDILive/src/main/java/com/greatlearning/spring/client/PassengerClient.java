package com.greatlearning.spring.client;

import com.greatlearning.spring.beans.CabDriver;
import com.greatlearning.spring.beans.Passenger;

public class PassengerClient {
	
	public static void main(String[] args) {
		//we are responsible for creating the instance
		CabDriver kishore = new CabDriver("Kishore","123456789");
		CabDriver suraj = new CabDriver("suraj","789456123");
		
		//we are responsible for injecting cab driver instance to passenger
		Passenger hari = new Passenger(kishore,"Praveen");
		hari.commute("Maratahalli", "Airport");
		hari.printDetails();
	}
}
