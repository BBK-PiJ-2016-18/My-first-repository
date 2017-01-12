import java.util.ArrayList;

public class NewHailstoneCalc {

	private ArrayList<Integer> result = null;
	
	public ArrayList<Integer> hailstone(int n) {	
		result = new ArrayList<Integer>();
		nextHailstone(n);
		return result;
	}
	
	// The recursive nextHailstone adds 'n' to 'result' before 
	// it computes the next hailstone value.
	
	public void nextHailstone(int n) {		
		if (n > 1) {	
			result.add(n);	
			if(n%2==0)
				nextHailstone(n/2);
			else
				nextHailstone(3*n+1); 
		}
		return;	// the base-case for the recursion is when n <= 1.	
	}
}
