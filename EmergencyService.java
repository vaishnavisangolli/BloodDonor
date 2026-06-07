package Service;

import Interfaces.Alertable;

public class EmergencyService
        implements Alertable {

    @Override
    public void sendAlert() {

        System.out.println(
                "\nEmergency Alert Sent To Donors!");
    }
}