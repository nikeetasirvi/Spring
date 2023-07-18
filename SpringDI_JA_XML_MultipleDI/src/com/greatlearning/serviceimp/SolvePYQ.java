package com.greatlearning.serviceimp;

import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;

@Component("solvePYQ")
public class SolvePYQ implements ExamTip {

	@Override
	public String getExamTip() {
		return "solve atleast 5 years PYQ";
	}

}
