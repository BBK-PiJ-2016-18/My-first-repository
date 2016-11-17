public class SmartPhone extends MobilePhone {
	public void browseWeb (String url) {
		System.out.println("Now browsing: " + url);
	}
	public String findPosition() {		
		return "0, 51";
	}
	@Override
	public void call (String number) {
		super.call (number);
		if (number.substring(0,2).equals("00")) {
			System.out.println("Calling " + number + " through internet to save money");
		}
	}
}