public class FibLauncher {
	public static void main (String[] args) {
		FibCalc calc = new FibCalc();
		calc.getFibRec(1);
		calc.getFibIt(1);
		calc.getFibRec(4);
		calc.getFibIt(4);
		calc.getFibRec(6);
		calc.getFibIt(6);
		calc.getFibRec(10);
		calc.getFibIt(10);
		calc.getFibRec(40);
		calc.getFibIt(40);
		calc.getFibRec(45);
		calc.getFibIt(45);
		calc.getFibIt(1);
		calc.getFibIt(2);
		calc.getFibIt(3);
		calc.getFibIt(4);
		calc.getFibIt(5);
		calc.getFibIt(6);
	}
}