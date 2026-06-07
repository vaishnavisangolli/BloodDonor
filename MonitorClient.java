package RMI;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class MonitorClient {

    public static void main(String[] args) {

        try {

            Registry registry =
                    LocateRegistry
                            .getRegistry(
                                    "localhost",
                                    1099);

            MonitorInterface obj =
                    (MonitorInterface)
                            registry.lookup(
                                    "BloodMonitor");

            System.out.println(
                    obj.getStatus());

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}