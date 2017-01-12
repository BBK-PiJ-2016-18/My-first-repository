public class Ex4 {
	public static String betterElement(String s1, String s2, TwoElementPredicate<String> predicate) {
		if (predicate.better(s1, s2) == true) {
			return s1;
		}
		return s2;
	}
	
	public static void main(String[] args) {
		System.out.print("Please enter a string: ");
		String s = System.console().readLine();
		System.out.print("Please enter another string: ");
		String t = System.console().readLine();
		String output = betterElement(s, t, (s1, s2) -> s1.length() > s2.length());
		System.out.println("The longer string is: " + output);
	}
}