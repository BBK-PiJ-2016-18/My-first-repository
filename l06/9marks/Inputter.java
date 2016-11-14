class Inputter {
	private static int markCount = 0;
	private int mark;
	private String grade;
	
	public void inputMark(Mark inputmark) {
		system.out.println("Input a mark: ");
		inputmark.mark = Integer.parseInt(System.console().readLine());
		assignGrade(inputMark);
	}
	
	public void assignGrade (Mark thismark) {
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