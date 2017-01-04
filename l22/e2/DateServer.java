import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.GregorianCalendar;
import java.util.Date;

public class DateServer extends UnicastRemoteObject implements DateService {
	public DateServer() throws RemoteException {
		// nothing to initialise for this server, but it is important
		// to declare that the constructor throws RemoteException
	}
	
	@Override
	public static String dateTime(GregorianCalendar calendar) {
		// This println() is not necessary, but helps verifying whether
		// the server has received the call or not on the remote machine
		return calendar.toString();
	}
}