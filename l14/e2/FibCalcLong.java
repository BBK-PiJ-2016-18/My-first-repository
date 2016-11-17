public class FibCalcLong {
	private long[] precalculated = null;
	private long fib(int n) {
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated.length < n) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			long result = fib(n-1) + fib(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}
	private void initPrecalculatedArray(int size) {
		precalculated = new long[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1L; // to indicate "not calculated yet"
		}
		precalculated[0] = 1L; // F(1)
		precalculated[1] = 1L; // F(2)
	}
	
	public void printFib(int n) {
		System.out.println("F(" + n + ") = " + fib(n));
	}
}