package Model;

public class Hospital {

    private String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void display() {
        System.out.println("Hospital : " + hospitalName);
    }
}