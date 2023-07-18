package driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Teacher;
import serviceimp.HindiTeacher;
import serviceimp.MathsTeacher;

public class SpringMain {

	public static void main(String[] args) {
		
		// 1: Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		
		// 2: Retrive bean from spring container
		System.out.println("-----------------------------------------");
		Teacher teacher1 = context.getBean("hindiTeacher",HindiTeacher.class);
		Teacher teacher2 = context.getBean("hindiTeacher",HindiTeacher.class);
		Teacher teacher3 = context.getBean("mathsTeacher",MathsTeacher.class);
		
		if(teacher1 == teacher2) {
			System.out.println("scope will be singletone");
		} else {
			System.out.println("scope will be prototype");
		}
		System.out.println(teacher1);
		System.out.println(teacher2);
		
		// 3: Call methods on the bean
		System.out.println(teacher1.getHomework());
		System.out.println(teacher3.getHomework());
		System.out.println("-----------------------------------------");
		
		// 4: Close the context
		context.close();
	}

}
