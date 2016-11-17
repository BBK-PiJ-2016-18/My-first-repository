public interface User {
	
	/** Returns the user's name
	*/
	String getName();
	
	/** Returns the User's ID number
	*/
	int getID();
	
	/** Registers a user at the library
	*/
	int register(LibraryMock library);
	
	/** Returns the library with which the user is registered
	*/
	String getLibrary();
}