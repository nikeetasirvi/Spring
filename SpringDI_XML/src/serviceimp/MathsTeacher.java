package serviceimp;

import service.ExamTip;
import service.Teacher;

public class MathsTeacher implements Teacher {

	//defining a private field for dependency
	ExamTip examTip;

	public MathsTeacher() {}

	//define a constructor for dependency injection
	public MathsTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}
	
	@Override
	public String getHomework() {
		return "solve 10 maths problems";
	}

	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}

}
