package com.greatlearning.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

@Component
public class GKTeacher implements Teacher {

	//defining a private field for dependency
	ExamTip examTip;
	
	public GKTeacher() {}
	
	//define a constructor for dependency injection
	@Autowired
	public GKTeacher(@Qualifier("revisionTip")ExamTip examTip) {
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
