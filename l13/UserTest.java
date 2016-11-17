import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
	
	private User testUser;
	private LibraryMock testLibrary;
	
	// setup
	
	@Before
	public void setUp() {
		
		testUser = new UserImpl("Joe Bloggs");
		testLibrary = new LibraryMock();
	}

	
	// test

	@Test
	public void testsNameGetter() {
		
		String testName = (testUser.getName());
		
		String expected = "Joe Bloggs";
		
		assertEquals(testName, expected);
	}
	
	@Test
	public void testsRegister() {
		
		int testUserID = (testUser.register(testLibrary));
		
		int expected = 13;
		
		assertEquals(testUserID, expected);
	}
	
	@Test
	public void testsGetLibrary() {
		
		String testLibraryName = (testLibrary.getName());
		
		String expected = "Library name";
		
		assertEquals(testLibraryName, expected);
	}
	

}