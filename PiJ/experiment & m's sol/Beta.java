import java.util.ArrayList;

public class Beta {

	private ArrayList<Integer> result = null;
	
	public ArrayList<Integer> hailstone(int n) {	
		result = new ArrayList<Integer>();
		nextHailstone(n);
		return result;
	}
	
	// The recursive nextHailstone adds 'n' to 'result' before 
	// it computes the next hailstone value.
	
	public void nextHailstone(int n) {		
		if (n < 10) {	
			result.add(n);	
			nextHailstone(n+1);
		}
		return;	// the base-case for the recursion is when n <= 1.	
	}
}
