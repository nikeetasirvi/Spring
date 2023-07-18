package com.greatlearning.serviceimp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.greatlearning.service.Teacher;

//by default id of beam will be gkTeacher
@Component
@Scope("prototype")
public class GKTeacher implements Teacher {

	@Override
	public String getHomework() {
		
		return "read current affairs";
	}

}
