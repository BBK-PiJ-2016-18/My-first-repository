public class PhoneLauncher2 {
	public static void main(String[] args) {
		SmartPhone2 myPhone = new SmartPhone2();
		System.out.println("Your position is: " + myPhone.findPosition());
		System.out.print("Enter a URL: ");
		myPhone.browseWeb(System.console().readLine());
		myPhone.call("0034567890");
		myPhone.call("452141455");
		myPhone.call("858656545");
		myPhone.call("00262846");
		myPhone.printLastNumbers();
		myPhone.playGame();
	}	
}