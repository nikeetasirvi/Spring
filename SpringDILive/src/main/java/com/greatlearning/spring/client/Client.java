package com.greatlearning.spring.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.spring.beans.Passenger;

public class Client {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Passenger passenger = applicationContext.getBean("passenger",Passenger.class);
		passenger.commute("BTM-Layout","KR-Puram");
		passenger.printDetails();
		
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
	}
}
