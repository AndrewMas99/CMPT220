//Andrew Masone
/*
1. Using exception handling, write a Java program that prompts the user to enter a string and displays
the length of the string. The only characters that are allowed are letters and numbers. If the user
enters anything other than letters and numbers, the program should display a message and ask the
user to enter a string again.
 */
import java.util.Scanner;

public class problem1_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String str = "";

        while (!valid) {
            System.out.print("Enter a string: ");
            str = input.nextLine();
            try {
                // Check if the string contains only letters and numbers
                if (str.matches("[a-zA-Z0-9]+")) {
                    valid = true;
                } else {
                    throw new Exception();
                }
            }
            catch (Exception e) {
                System.out.println("The string should only contain letters and numbers. Please try again.");
            }
        }

        System.out.println("The length of the string is: " + str.length());
    }
}


