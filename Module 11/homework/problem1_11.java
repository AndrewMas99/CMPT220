//Andrew Masone
/*
1. Ask the user for a string and a substring of the given string. Using recursion (no loops), write a method
that returns the number of times the substring appears in the string.
public static int count(String str, String sub)
Below is a sample run:
Enter a string: Welcome to Java
Enter a substring: o
The substring o appears 2 times in the string Welcome to Java
 */

import java.util.Scanner;

public class problem1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string   : ");
        String str1 = scanner.nextLine();
        System.out.print("Enter a substring: ");
        String str2 = scanner.nextLine();
        scanner.close();

        int var3 = count(str1, str2);
        System.out.printf("The substring: " + str2 + " appears " + var3 + " times in the string: "+str1);
    }

    public static int count(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return 0;
        } else if (str1.startsWith(str2)) {
            return 1 + count(str1.substring(str2.length()), str2);
        } else {
            return count(str1.substring(1), str2);
        }
    }
}

