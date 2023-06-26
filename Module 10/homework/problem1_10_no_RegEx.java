//Andrew Masone

/*
Same thing but without using regex
*/
import java.util.Scanner;

public class problem1_10_no_RegEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;

        while (true) {
            System.out.print("Enter a string: ");
            str = input.nextLine();

            if (isAlphaNumeric(str)) {
                break;
            }

            System.out.println("The string should only contain letters and numbers. Please try again.");
        }

        System.out.println("The length of the string is: " + str.length());
    }

    public static boolean isAlphaNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        return true;
    }
}
