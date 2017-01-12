public class HashUtilities {
	public static void main (String[] args) {
		System.out.println("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		System.out.println(hash);
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
	}
	public static int shortHash(int n) {
		int m = n % 1000;
		return m;
	}
}