public class fibCalc {
	private int fib (int n) {
		if (n <= 2) {
			return 1;
		}
		else {
			int result = fib(n-1) * fib(n-2)
			return result;
		}
	}
}