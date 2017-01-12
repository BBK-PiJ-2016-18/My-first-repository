class FactorialLauncher {
	public static void main (String[] args) {
		FactorialCalculator calc = new FactorialCalculator();
		calc.getFactRec(6);
		calc.getFactIt(6);
		calc.getFactRec(1);
		calc.getFactIt(1);
		calc.getFactRec(10);
		calc.getFactIt(10);
	}
}