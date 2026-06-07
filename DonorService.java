package Service;

import Model.Donor;

public class DonorService {

    private static Donor[] donors =
            new Donor[10];

    private static int count = 0;

    public static void addDonor(Donor donor) {

        if(count < donors.length) {

            donors[count] = donor;
            count++;
        }
    }

    public static void showDonors() {

        for(int i = 0; i < count; i++) {

            donors[i].display();

            System.out.println("----------------");
        }
    }

    public static Donor[] getDonors() {
        return donors;
    }

    public static int getCount() {
        return count;
    }
}