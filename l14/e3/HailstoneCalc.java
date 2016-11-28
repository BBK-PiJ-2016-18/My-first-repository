import java.util.ArrayList;

public class HailstoneCalc {

	public ArrayList<Integer> hailstone(int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		return nextHailstone(result, n);
	}
	
	private ArrayList<Integer> nextHailstone(ArrayList<Integer> currentList, int n) {
		ArrayList<Integer> result = currentList;
		result.add(n);
		if (n > 1) {
		
			if (n % 2 == 0) {				
				ArrayList<Integer> temp = nextHailstone(result, n / 2);
				for(int i = 0; i<temp.size();i++)
					result.add(temp.get(i));
			}
			else {
				ArrayList<Integer> temp = nextHailstone(result, 3 * n + 1);
				for(int i = 0; i<temp.size();i++)
					result.add(temp.get(i));
			}
		}
		
		return result;
	}
	
/*
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
*/	
}
