public class Calculator {
	public static void main (String[] args) {
		Calculator 	c = new Calculator ();
		System.out.println (c.add(3,4));
	}
	public int add;
	public int subtract;
	public int multiply;
	public double divide;
	public int modulus;
	
	public int add(int x, int y) {
		return x + y;
	}
	public int subtract(int x, int y) {
		return x - y;
	}
	public int multiply(int x, int y) {
		return x * y;
	}
	public double divide(int x, int y) {
		double a = (double) x;
		double b = (double) y;
		return a / b;
	}
	public int modulus(int x, int y) {
		return x % y;
	}
}