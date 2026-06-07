package Threads;

import Service.EmergencyService;

public class EmergencyAlertThread
        extends Thread {

    @Override
    public void run() {

        EmergencyService service =
                new EmergencyService();

        service.sendAlert();
    }
}