package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimp.HindiTeacher;

public class SpringMain {

	public static void main(String[] args) {
		
		// 1: Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		
		// 2: Retrive bean from spring container
		Teacher teacher = context.getBean("hindiTeacher",HindiTeacher.class);
		
		// 3: Call methods on the bean
		System.out.println(teacher.getHomework());
		System.out.println(teacher.getExamTip());
		
		// 4: Close the context
		context.close();
	}

}
