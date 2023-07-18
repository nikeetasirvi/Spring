package serviceimp;

import service.ExamTip;
import service.Teacher;

public class HindiTeacher implements Teacher {

	//defining a private field for dependency
	ExamTip examTip;

	public HindiTeacher() {}

	//define a constructor for dependency injection
	public HindiTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}

	@Override
	public String getHomework() {
		return "write one page in hindi";
	}

	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}

}
