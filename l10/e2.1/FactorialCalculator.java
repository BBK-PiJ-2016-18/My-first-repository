public class FactorialCalculator {
	private int factorialRec(int n) {
		if (n==1) {
			return 1;
		}
		else {
			int result = n * factorialRec (n-1);
			return result;
		}
	}
	private int factorialIt (int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = i * result;
		}
		return result;
	}
	public void getFactRec(int n) {
		System.out.println(factorialRec(n));
	}
	public void getFactIt(int n) {
		System.out.println(factorialIt(n));
	}
}