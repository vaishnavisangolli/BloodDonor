package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MonitorInterface
        extends Remote {

    String getStatus()
            throws RemoteException;
}