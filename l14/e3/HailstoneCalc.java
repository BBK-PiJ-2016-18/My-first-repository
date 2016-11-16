public class HailstoneCalc {
	private int nextHailstone(int n) {
		if (n % 2 == 0) {
			return n / 2;
		}
		else {
			return 3 * n + 1;
		}
	}
	public int getNextHailstone(int n) {
		return nextHailstone(n);
	}
	public void printNextHailstone(int n) {
		System.out.println("Given " + n + ", the next hailstone number is " + nextHailstone(n));
	}
	
	public int[] hailstoneSeq(n) {
		hailstoneSeq(n)[0] = n;
		while [hailstoneSeq(n)[i] != 1) {
			hailstoneSeq(n)[i + 1] = getNextHailstone(i)
		}
	}
	
	public void printHailstoneSeq(n) {
		for (i = 0; i <= hailstoneSeq(n).length; i++) {
			System.out.println(hailstoneSeq(n)[i])
		}
	}
	
}