public class SmartPhone extends MobilePhone {
	public void browseWeb (String url) {
		System.out.println("Now browsing: " + url);
	}
	public String findPosition() {		
		return "0, 51";
	}
}