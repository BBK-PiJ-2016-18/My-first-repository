import java.util.Arrays;

public class Comparator {
	
	Comparator(Array list) {
		Array ordered = new Array();
	}
		
	public int compare(int n1, int n2) {
		if (n1 < n2) {
			return -1;
		}
		else if (n1 == n2) {
			return 0;
		}
		return 1;
	}
}