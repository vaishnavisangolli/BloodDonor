package Service;

import Model.Donor;

public class BloodBankService {

    public static void searchDonor(
            String bloodGroup) {

        boolean found = false;

        Donor[] donors =
                DonorService.getDonors();

        int count =
                DonorService.getCount();

        for(int i = 0; i < count; i++) {

            if(donors[i]
                    .getBloodGroup()
                    .equalsIgnoreCase(
                            bloodGroup)) {

                donors[i].display();

                found = true;
            }
        }

        if(!found) {

            System.out.println(
                    "No Donor Found");
        }
    }
}