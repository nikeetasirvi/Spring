package com.greatlearning.spring.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.spring.beans.User;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		User userBean = context.getBean("user", User.class);
		
		List<String> phoneNo = userBean.getPhoneNo();
		System.out.println(phoneNo);
		
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}