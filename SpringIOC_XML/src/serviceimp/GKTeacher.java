package serviceimp;

import service.Teacher;

public class GKTeacher implements Teacher {

	@Override
	public String getHomework() {
		
		return "read current affairs";
	}

}
