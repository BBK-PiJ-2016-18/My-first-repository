public class PersonQueueLinkedList implements PersonQueue {
	private Person firstPerson;
	
	public void insert(Person newPerson){
		Person current = this.firstPerson;
		if (firstPerson == null) {
			this.firstPerson = newPerson;
		}
		else {
			while (current.getNextPerson() != null){
			current = current.getNextPerson();
			}
			current.setNextPerson(newPerson);
		}
	}
	
	public Person retrieve() {
		Person served = firstPerson;
		firstPerson = served.getNextPerson();
		return served;
	}
}