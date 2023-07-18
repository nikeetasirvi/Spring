package com.greatlearning.serviceimp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.greatlearning.service.Teacher;

//by default id of beam will be mathsTeacher
@Component
//by default singleton
@Scope
public class MathsTeacher implements Teacher {

	@Override
	public String getHomework() {
		
		return "solve 10 maths problems";
	}

}
