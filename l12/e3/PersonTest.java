import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input1 = "Dereck Robert Yssirt";
		String output1 = p.getInitials(input1);
		String expected1 = "DRY";
		assertEquals(output1, expected1);
		Person q = new Person();
		String input2 = "Donald  John  Trump";
		String output2 = q.getInitials(input2);
		String expected2 = "DJT";
		assertEquals(output2, expected2);
	}
}