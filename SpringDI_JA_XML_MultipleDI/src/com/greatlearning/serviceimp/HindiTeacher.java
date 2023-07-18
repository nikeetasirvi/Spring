package com.greatlearning.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

@Component
public class HindiTeacher implements Teacher {

	//defining a private field for dependency
	ExamTip examTip;

	public HindiTeacher() {}

	//define a constructor for dependency injection
	@Autowired
	public HindiTeacher(@Qualifier("revisionTip")ExamTip examTip) {
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
