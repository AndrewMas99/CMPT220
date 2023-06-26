//Andrew Masone

/*
2. Design a Java class named Booking to represent a passenger booking. The class should have the
following fields and methods:
Private data fields:
– passenger as an AirlinePassenger object
– flightNumber as a String
– seatNumber as a String
– bookingDateTime as a java.time.LocalDateTime object
– bookingTime as a Time
– bookingNumber as a String
Methods:
– A no-arg constructor that initializes the data fields to default values.
– A constructor with the arguments for passenger, flightNumber, bookingDateTime. The
booking number gets generated automatically. It can be a random string of 6 uppercase
letters.
– Setter and getter methods for all the private fields.
– Override the method toString() to print the booking information in a nice format.
Draw the UML-PassengerBooking diagram for the class, then implement the class. Copy the test program from the
previous exercise and expand it to ask the user for a flight number booking date and time and generate
a booking. Print out the booking information.
 */

import java.util.Scanner;

public class Problem2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String name = input.nextLine();
        System.out.print("Enter passenger email: ");
        String email = input.nextLine();

        // Create a new AirlinePassenger object
        AirlinePassenger passenger = new AirlinePassenger();

        System.out.print("Enter flight number: ");
        String flightNumber = input.nextLine();

        /*
        System.out.print("Enter booking date (dd/MM/yyyy): ");
        String bookingDate = input.nextLine();
        System.out.print("Enter booking time (HH:mm): ");
        String bookingTime = input.nextLine();
        String bookingDateTime = bookingDate + " " + bookingTime;
        */
        long currentTime = System.currentTimeMillis();
        String dateString = new java.sql.Date(currentTime).toString();
        String[] dateParts = dateString.split("-");
        String bookingDateTime = dateParts[1] + "/" + dateParts[2] + "/" + dateParts[0];
        //System.out.println(bookingDateTime+" bookingDateTime");


        // Create a new PassengerBooking object
        PassengerBooking booking = new PassengerBooking();

        // Display the booking information
        System.out.println(booking.toString());
    }
}
