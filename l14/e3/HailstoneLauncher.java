public class HailstoneLauncher {
	public static void main (String[] args) {
		HailstoneCalc calc = new HailstoneCalc();
		calc.printNextHailstone(17);
		calc.printNextHailstone(18);
		calc.printHailstoneSeq(18);
	}
}