public class Launcher {
	public static void main (String[] args) {
		FibCalc myCalc = new FibCalc();
		SlowCalc slow = new SlowCalc();
		slow.getFibRec(40);
		slow.getFibRec(45);
		System.out.println("F(40) = " + myCalc.fib(40));
		System.out.println("F(41) = " + myCalc.fib(41));
		System.out.println("F(42) = " + myCalc.fib(42));
		System.out.println("F(43) = " + myCalc.fib(43));
		System.out.println("F(44) = " + myCalc.fib(44));
		System.out.println("F(45) = " + myCalc.fib(45));
	}
}