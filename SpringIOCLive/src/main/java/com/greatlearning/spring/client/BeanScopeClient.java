package com.greatlearning.spring.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.spring.beans.User;

public class BeanScopeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");	

		User userBean1 = context.getBean("user",User.class);
		User userBean2 = context.getBean("user",User.class);
		
		if(userBean1 == userBean2) {
			System.out.println("Singleton");
		} else {
			System.out.println("prototype");
		}

		((AbstractApplicationContext)context).registerShutdownHook();
		
	}

}
