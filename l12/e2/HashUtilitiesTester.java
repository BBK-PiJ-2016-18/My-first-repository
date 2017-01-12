import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTester {
	@Test
	public void testsNumber() {
		int randomnumber = (int) Math.floor(Math.random() * 10000); // Test at home!
		int input = randomnumber - 5000;
		int output = HashUtilities.shortHash(input);
		assertEquals(numberWithinRange(output, 0, 1000),true);
		
		}
		private boolean numberWithinRange(int n, int a, int b) {
			boolean within = true;
			if (n < a) {
				within = false;
			}
			if (n > b) {
				within = false;
			}
			return within;
		}
}