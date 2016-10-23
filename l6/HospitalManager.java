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
}