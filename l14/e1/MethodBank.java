public class MethodBank {	
	int mcCarthy91(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			System.out.println("n = " + n);
			System.out.println("n + 11 = " + (n + 11));
			System.out.println("mcCarthy91(n+11) = " + (mcCarthy91(n + 11)));
			System.out.println("mcCarthy91(n)" + mcCarthy91(mcCarthy91(n+11)));
			return mcCarthy91(mcCarthy91(n+11));
		}
	}
}