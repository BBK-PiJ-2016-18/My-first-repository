import java.rmi.Remote;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.util.GregorianCalendar;

public class DateClientLauncher {
	public static void main(String[] args) {
		try {
			String registryAddress = "127.0.0.1";
			Remote service = Naming.lookup("//" + registryAddress + ":1099/echo");
			GregorianCalendar calendar = new GregorianCalendar(2016, 12, 14, 16, 21, 57);
			String dateTime = DateServer.dateTime(calendar);
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}