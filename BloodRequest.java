package Model;

public class BloodRequest {

    private String patientName;
    private String bloodGroup;

    public BloodRequest(String patientName,
                        String bloodGroup) {

        this.patientName = patientName;
        this.bloodGroup = bloodGroup;
    }

    public void display() {

        System.out.println("Patient : " + patientName);
        System.out.println("Required Blood : " + bloodGroup);
    }
}