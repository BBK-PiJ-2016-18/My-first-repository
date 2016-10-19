public class App {
	public static void main (String[] args) {
		
		HospitalManager manager = new HospitalManager();
		
		manager.addPatient( new Patient("Robert", 22, "Spanish flu"));
		manager.addPatient( new Patient("Bill", 31, "Spanish flu"));
		manager.addPatient( new Patient("George", 54, "Spanish flu"));
		manager.addPatient( new Patient("Alexander ", 35, "Spanish flu"));
		manager.addPatient( new Patient("Patrick", 23, "Spanish flu"));
		manager.addPatient( new Patient("Maria", 30, "Spanish flu"));
		manager.addPatient( new Patient("Susan", 22, "Spanish flu"));
		manager.addPatient( new Patient("Jules", 22, "Spanish flu"));
		manager.addPatient( new Patient("george", 22, "Spanish flu"));
		manager.addPatient( new Patient("Alex", 22, "Spanish flu"));
		
		manager.printPatients();
	}
}