package com.greatlearning.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

@Component
public class MathsTeacher implements Teacher {

	//defining a private field for dependency
	ExamTip examTip;

	public MathsTeacher() {}

	//define a constructor for dependency injection
	@Autowired
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
