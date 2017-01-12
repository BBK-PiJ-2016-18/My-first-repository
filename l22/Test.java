import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.GregorianCalendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		GregorianCalendar myCal = new GregorianCalendar(2016, 12, 14, 16, 21, 57);
		System.out.println(myCal.toString());
	}
}