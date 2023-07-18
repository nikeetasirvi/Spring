package serviceimp;

import service.ExamTip;

public class RevisionTip implements ExamTip {

	@Override
	public String getExamTip() {
		return "Do a lot of revision";
	}

}
