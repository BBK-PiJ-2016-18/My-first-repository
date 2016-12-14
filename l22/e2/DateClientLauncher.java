import java.rmi.Remote;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;

public class DateClientLauncher {
	public static void main(String[] args) {
		try {
			String registryAddress = "127.0.0.1";
			Remote service = Naming.lookup("//" + registryAddress + ":1099/echo");
			DateService dateServer = (DateService) service;
			String receivedEcho = dateServer.echo("Hello!");
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}