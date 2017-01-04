public class FibCalc {
	private int fibRec (int n) {
		if (n <= 2) {
			return 1;
		}
		else {
			int result = fibRec(n-1) + fibRec(n-2);
			return result;
		}
	}
	private int fibIt (int n) {
		if (n <= 2) {
			return 1;
		}
		else {
			int currentFib = 1;
			int prevFib = 1;
			for (int i = 3; i <= n; i++) {
				int newFib = currentFib + prevFib;
				prevFib = currentFib;
				currentFib = newFib;
			}
			return currentFib;
		}
	}
	public void getFibRec (int n) {
		System.out.println("F(" + n + ") = " + fibRec(n) + " 	(Rec)");
	}
	public void getFibIt (int n) {
		System.out.println("F(" + n + ") = " + fibIt(n) + " 	(It)");
	}
}