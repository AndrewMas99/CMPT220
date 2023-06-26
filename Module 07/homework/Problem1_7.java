//Andrew Masone

/*
1. Design a Java class to represent an airline passenger.
The class should be called AirlinePassengerand have the following fields and methods:
Private data fields:
– title as a String
– firstName as a String
– lastName as a String
– dob as a Date
– mobileNumber as a String
– frequentFlyerNumber as a String
– milesFlown as an int
– nationality as a String
– passportNumber as a String
– passportExpiry as a Date
– passportCountry as a String
– passportIssueDate as a Date
 Methods:
– A no-arg constructor that initializes the data fields to default values.
– A second constructor with the arguments for title, firstName, lastName, dob.
– Setter and getter methods for all the private fields.
– A method addMiles(int miles) to add miles to the milesFlown field.
– Override the method toString() to print the passenger information in a nice format.
Draw the UML-AirlinePassenger diagram for the class, then implement the class. Write a test program that prompts
the user to enter passenger information, creates an instance of the class and prints out the information.
 */

import java.util.Scanner;
public class Problem1_7 {
    public static void main(String[] args) {

        //here's a test program that prompts the user to enter passenger information, creates an instance of the `AirlinePassenger` class and prints out the information:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter first name: ");
        String FN = scanner.nextLine();

        System.out.print("Enter last name: ");
        String LN = scanner.nextLine();

        System.out.print("Enter date of birth: ");
        String dob = scanner.nextLine();

        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter frequent flyer number: ");
        String frequentFlyerNumber = scanner.nextLine();

        System.out.print("Enter miles flown: ");
        String milesFlown = scanner.nextLine();

        System.out.print("Enter nationality: ");
        String nationality = scanner.nextLine();

        System.out.print("Enter passport number: ");
        String passport = scanner.nextLine();

        System.out.print("Enter passport expiry date: ");
        String passportExp = scanner.nextLine();

        System.out.print("Enter passport country: ");
        String passportCountry = scanner.nextLine();

        System.out.print("Enter passport issue date: ");
        String passportIss = scanner.nextLine();

        AirlinePassenger passenger = new AirlinePassenger();
        passenger.settitle(title);
        passenger.setFN(FN);
        passenger.setLN(LN);
        passenger.setdob(dob);
        passenger.setphone(mobileNumber);
        passenger.setFFN(frequentFlyerNumber);
        passenger.setmiles(milesFlown);
        passenger.setNationality(nationality);
        passenger.setPassport(passport);
        passenger.setPassportExp(passportExp);
        passenger.setPassportCountry(passportCountry);
        passenger.setPassportIss(passportIss);

        System.out.println();
        System.out.println(passenger);
    }
}
