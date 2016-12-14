import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class DateServerLauncher {
	public static void main(String[] args) {
		DateServerLauncher server = new DateServerLauncher();
		server.launch();
	}
	private void launch() {
		try {
			// 1. Create the registry if there is not one
			LocateRegistry.createRegistry(1099);
			// 2. Create the server object
			DateServer server = new DateServer();
			// 3. Register (bind) the server object on the registy.
			// The registry may be on a different machine
			String registryAddress = "localhost";
			String registryUrl = "//" + registryAddress + "/";
			String serviceName = "date";
			Naming.rebind(registryUrl + serviceName, server);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} /**catch (NotBoundException ex) {
			ex.printStackTrace();
		}*/
	}
}