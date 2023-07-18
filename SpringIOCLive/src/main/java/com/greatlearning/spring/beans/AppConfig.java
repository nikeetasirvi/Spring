package com.greatlearning.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
	
	@Bean
	public Passenger passenger() {
		CabDriver driver = driver();
		return new Passenger(driver,"Manu");
	}
	
	@Bean
	public CabDriver driver() {
		return new CabDriver("Akash","2222222222");
	}
}
