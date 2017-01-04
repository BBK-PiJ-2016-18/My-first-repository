class Patient {
	private static int patientCount = 0;
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient prevPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.prevPatient = null;
		patientCount++;
	}
	
	public Patient getNextPatient() {
		return this.nextPatient;
	}
	
	public Patient getPrevPatient() {
		return this.prevPatient;
	}
	
	public void setNextPatient(Patient nextPatient){
		this.nextPatient = nextPatient;
	}
	
	public void setPrevPatient(Patient prevPatient){
		this.prevPatient = prevPatient;
	}
	
	public String getName() {
		return this.name;
	}
}