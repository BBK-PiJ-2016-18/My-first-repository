import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
	
	private Book testBook;
	
	// setup
	@Before
	public void setUp() {
		testBook = new BookImpl("Moby Dick", "Herman Melville");
	}

	
	// test

	@Test
	public void testsTitleGetter() {
		
		String testBookTitle = (testBook.getTitle());
		
		String expected = "Moby Dick";
		
		assertEquals(testBookTitle, expected);
	}
	@Test
	public void testsAuthorGetter() {
		
		String testBookAuthor = (testBook.getAuthor());
		
		String expected = "Herman Melville";
		
		assertEquals(testBookAuthor, expected);
	}
	

}