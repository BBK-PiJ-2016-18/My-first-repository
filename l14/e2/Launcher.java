public class Launcher {
	public static void main (String[] args) {
		FibCalc myCalc = new FibCalc();
		FibCalcLong longCalc = new FibCalcLong();
		SlowCalc slow = new SlowCalc();
		slow.getFibRec(40);
		// slow.getFibRec(45);
		myCalc.printFib(40);
		myCalc.printFib(45);
		myCalc.printFib(46);
		myCalc.printFib(47);
		longCalc.printFib(47);
		longCalc.printFib(90);
		longCalc.printFib(91);
		longCalc.printFib(92);
		longCalc.printFib(93);
		longCalc.printFib(94);
		
	}
}