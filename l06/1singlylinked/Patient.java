class Patient {
	private static int patientCount = 0;
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		patientCount++;
	}
	
	public Patient getNextPatient() {
		return this.nextPatient;
	}
	public void setNextPatient(Patient nextPatient){
		this.nextPatient = nextPatient;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static int getNumberOfPatients() {
			return patientCount;
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