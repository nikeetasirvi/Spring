package serviceimp;

import service.ExamTip;
import service.Teacher;

public class GKTeacher implements Teacher {

	//defining a private field for dependency
	ExamTip examTip;
	
	public GKTeacher() {}
	
	//define a constructor for dependency injection
	public GKTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}

	@Override
	public String getHomework() {
		return "read current affairs";
	}

	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}

}
