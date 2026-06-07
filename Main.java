package Main;

import java.util.Scanner;

import Model.Donor;
import Model.OrganDonor;
import Service.DonorService;
import Service.BloodBankService;
import Threads.EmergencyAlertThread;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Blood Donors
        Donor d1 = new Donor(1, "Rahul", "A+");
        Donor d2 = new Donor(2, "Sneha", "B+");
        Donor d3 = new Donor(3, "Diya", "A-");
        Donor d4 = new Donor(4, "Jiya", "B-");
        Donor d5 = new Donor(5, "Ram", "AB+");
        Donor d6 = new Donor(6, "Shyam", "AB-");
        Donor d7 = new Donor(7, "Keerti", "O+");

        // Organ Donors
        OrganDonor od1 = new OrganDonor(
                8,
                "Amit",
                "O+",
                "Kidney");

        OrganDonor od2 = new OrganDonor(
                9,
                "Deepa",
                "A+",
                "Eyes");

        OrganDonor od3 = new OrganDonor(
                10,
                "Medha",
                "B+",
                "Liver");

        OrganDonor od4 = new OrganDonor(
                11,
                "Ratna",
                "O+",
                "Heart");

        // Add Blood Donors
        DonorService.addDonor(d1);
        DonorService.addDonor(d2);
        DonorService.addDonor(d3);
        DonorService.addDonor(d4);
        DonorService.addDonor(d5);
        DonorService.addDonor(d6);
        DonorService.addDonor(d7);

        // Add Organ Donors
        DonorService.addDonor(od1);
        DonorService.addDonor(od2);
        DonorService.addDonor(od3);
        DonorService.addDonor(od4);

        System.out.println("\nALL DONORS");
        DonorService.showDonors();

        System.out.print("\nEnter Blood Group To Search : ");
        String group = sc.nextLine();

        BloodBankService.searchDonor(group);

        EmergencyAlertThread thread =
                new EmergencyAlertThread();
        thread.start();

        sc.close();
    }
}