package Model;

public class Donor extends Person {

    private String bloodGroup;

    public Donor(int id, String name, String bloodGroup) {

        super(id, name);
        this.bloodGroup = bloodGroup;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    @Override
    public void display() {

        super.display();
        System.out.println("Blood Group : " + bloodGroup);
    }
}