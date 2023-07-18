package driver;

import service.Teacher;
import serviceimp.MathsTeacher;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher = new MathsTeacher();
		System.out.println(teacher.getHomework());
	}

}
