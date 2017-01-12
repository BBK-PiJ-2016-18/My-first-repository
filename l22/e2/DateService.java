import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Locale;

public interface DateService extends Remote {
	/**
	* Returns the same string passed as parameter
	* @param s a string
	* @return the same string passed as parameter
	*/
	public static String dateTime(GregorianCalendar calendar) throws RemoteException;
}