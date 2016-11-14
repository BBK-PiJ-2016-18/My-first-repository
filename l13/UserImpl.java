public class UserImpl implements User {
	
	private String name;
	private int id;
	private LibraryMock library;
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return 0;
	}
	
	public int register(LibraryMock library) {
		this.library = library;
		return library.getID();
	}
	
	public String getLibrary() {
		return library.getName();
	}
}