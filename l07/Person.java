public class Person {
	private String firstname;
	private String surname;
	private int age;
	private Person nextPerson;
	

	public Person(String firstname, String surname, int age) {
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
		this.nextPerson = null;
	}

	public Person getNextPerson() {
		return this.nextPerson;
	}
	public void setNextPerson(Person nextPerson){
		this.nextPerson = nextPerson;
	}
	
}