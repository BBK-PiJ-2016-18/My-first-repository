import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Donald  John  Trump";
		String output = p.getInitials(input);
		String expected = "DJT";
		assertEquals(output, expected);
	}
}