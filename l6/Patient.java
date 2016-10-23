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
}