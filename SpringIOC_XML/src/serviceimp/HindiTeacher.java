package serviceimp;

import service.Teacher;

public class HindiTeacher implements Teacher {

	@Override
	public String getHomework() {
		
		return "write one page in hindi";
	}
	
	//init and destroy both should return void and name of method can be anything
	// if scope will be prototype then 2 time initial method will be called or else once
	public void doInitialJob() {
		System.out.println("under the initial method");
	}
	
	//if scope will be prototype then destroy method will not be called
	public void doFinalJob() {
		System.out.println("under the destroy method");
	}

}
