public class MethodBank {	
	public String doggyMethod(int n) {
		
		private String[] precalculated = null;
		
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		
		if (precalculated[n-1] != "") {
			return precalculated [n-1]
		}
		
		else {
			result = doggyMethod(n-3) + n + doggyMethod(n-2);
			precalculated [n-2] = result;
			return result;
		}
	}
	
	private void initPrecalculatedArray (int size) {
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = ""		
		}
	}
}