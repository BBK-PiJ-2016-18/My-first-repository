public class SmartPhoneLauncher {
	public static void main(String [] args) {
		SmartPhone myPhone = new SmartPhone();
		System.out.println("Your position is: " + myPhone.findPosition());
		System.out.print("Enter a URL: ");
		myPhone.browseWeb(System.console().readLine());
		myPhone.call("1234567890");
		myPhone.call("452141455");
		myPhone.call("858656545");
		myPhone.call("41262846");
		myPhone.printLastNumbers();
		myPhone.playGame();
		myPhone.getAlarmTime();
		myPhone.ringAlarm("659");
		myPhone.ringAlarm("700");
		myPhone.setAlarm(2300);
		myPhone.setAlarm(600);
		myPhone.ringAlarm("659");
		myPhone.ringAlarm("700");
	}	
}
