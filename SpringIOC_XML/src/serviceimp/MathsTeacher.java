package serviceimp;

import service.Teacher;

public class MathsTeacher implements Teacher {

	@Override
	public String getHomework() {
		
		return "solve 10 maths problems";
	}

}
