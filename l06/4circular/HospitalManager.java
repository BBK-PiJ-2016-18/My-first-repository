public class HospitalManager {
	private Patient firstPatient = null;
	
	public void addPatient (Patient newPatient){
		Patient current = this.firstPatient;
		if (firstPatient == null) {
			this.firstPatient = newPatient;
		}
		else {
			while (current.getNextPatient() != firstPatient){
			current = current.getNextPatient();
			}
			current.setNextPatient(newPatient);
		}
		newPatient.setNextPatient(firstPatient);
	}
	
	public void printPatients() {
		Patient current = this.firstPatient;
		if (firstPatient != null) {
			do {
				System.out.println(current.getName());
				current = current.getNextPatient();
			} while (current != firstPatient);
		}
		else {
			System.out.println("Null");
		}
		System.out.println("There are " + countPatients() + " patients");
	}
		
	public boolean deletePatient(String name) {
	if (firstPatient == null) {
	// list is empty, nothing to remove
	return false;
	}
	if (firstPatient.getName().equals(name)) {
	// first patient in the list must be removed
	firstPatient = firstPatient.getNextPatient();
	return true;
	}
	Patient current = firstPatient;
	while (current.getNextPatient() != firstPatient) {
	if (current.getNextPatient().getName().equals(name)) {
	// We found it! It is the next one!
	// Now link this patient to the one after the next
	current.setNextPatient(current.getNextPatient().getNextPatient());
	return true;
	}
	current = current.getNextPatient();
	}
	return false;
	}
	
	private int countPatients() {
        int count = 0;
        Patient nextPatient = firstPatient;
        do {
            count++;
            nextPatient = nextPatient.getNextPatient();
        } while (nextPatient != firstPatient);
        return count;
}
}