package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MonitorServer
        extends UnicastRemoteObject
        implements MonitorInterface {

    public MonitorServer()
            throws RemoteException {

        super();
    }

    @Override
    public String getStatus() {

        return "Blood Bank Server Running";
    }

    public static void main(String[] args) {

        try {

            MonitorServer server =
                    new MonitorServer();

            Registry registry =
                    LocateRegistry
                            .createRegistry(1099);

            registry.rebind(
                    "BloodMonitor",
                    server);

            System.out.println(
                    "RMI Server Started");

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}