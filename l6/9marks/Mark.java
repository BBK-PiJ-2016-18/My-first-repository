class Mark {
	private int mark;
	private String grade;
}

public int getMark() {
	return this.mark;
}

public String getGrade(Mark thismark) {
	if (thismark.getMark() > 70) {
			mark.grade = "Distinction";
		}
		else if (thismark.getMark() > 50) {
			thismark.grade = "Pass";
		}
		else if (thismark.getMark() > 0) {
			thismark.grade = "Fail";
		}
		else {
			thismark.grade = "Invalid";
		}
	}
}