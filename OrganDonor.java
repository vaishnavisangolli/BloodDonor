package Model;

public class OrganDonor extends Donor {

    private String organ;

    public OrganDonor(int id,
                      String name,
                      String bloodGroup,
                      String organ) {

        super(id, name, bloodGroup);
        this.organ = organ;
    }

    @Override
    public void display() {

        super.display();
        System.out.println("Organ : " + organ);
    }
}