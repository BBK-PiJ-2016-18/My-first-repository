public class Supermarket {
	PersonQueueLinkedList queue = new PersonQueueLinkedList();
	public void addPerson (Person person) {
		 queue.insert(person);
	}
	public Person servePerson() {
		return queue.retrieve();
	}
}