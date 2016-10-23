public class HospitalManager {
	private Patient firstPatient = null;
	
	public void addPatient (Patient newPatient){
		Patient current = this.firstPatient;
		if (firstPatient == null) {
			this.firstPatient = newPatient;
		}
		else {
			while (current.getNextPatient() != null){
			current = current.getNextPatient();
			}
			current.setNextPatient(newPatient);
		}
	}
	
	public void printPatients() {
		Patient current = this.firstPatient;
		if (firstPatient != null) {
			while (current.getNextPatient() != null){
				System.out.println(current.getName());
				current = current.getNextPatient();
			}
			System.out.println(current.getName());
		}
		else {
			System.out.println("Null");
		}
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
	while (current.getNextPatient() != null) {
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
}