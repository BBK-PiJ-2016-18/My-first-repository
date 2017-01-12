public class MobilePhone extends OldPhone {
	private int alarmTime = 0700;
	public void setAlarm (int newAlarmTime) {
		this.alarmTime = newAlarmTime;
	}
	public void ringAlarm (String time) {
		if (Integer.parseInt(time) == alarmTime) {
			System.out.println("Alarm now ringing!");
		}
		else {
			System.out.println("Alarm not ringing.");
		}
	}
	public void playGame () {
		System.out.print("Select a game to play: ");
		System.out.println("Now playing " + System.console().readLine());
	}
	public void printLastNumbers() {
		for(int i = 0; i < this.indexOfLastNumberDialled - 1; i++) {
			System.out.print(this.getNumberFromTheList(i) + ", ");
		}
		System.out.println(this.getNumberFromTheList(indexOfLastNumberDialled - 1));
	}
}