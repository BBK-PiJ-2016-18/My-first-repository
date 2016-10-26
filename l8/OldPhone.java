public class OldPhone implements Phone {
	public void call (String number) {
		if (number.length() == 13) {
			System.out.println("Now calling" + number);
		}
		else {
			System.out.println("That is not a valid number");
		}
	}
}