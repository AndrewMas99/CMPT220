//Andrew Masone
/*
Write a method that given a string, return true if it is a nesting of zero or more pairs of parenthesis,
like “(())” or “((()))”. Suggestion: check the first and last chars, and then recur on what’s inside them.
public static boolean nestParen(String str)
Write a test program that prompts the user to enter a string and displays whether the string is a
nesting of zero or more pairs of parenthesis. Below is a sample run:
Enter a string: ((()))
The string ((())) is a nesting of zero or more pairs of parenthesis
 */

import java.util.Scanner;

public class problem2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();
        scanner.close();

        int count = nestParent(str1);
        if (count != -1) {
            System.out.printf("The string " + str1 + " is a nesting of " + count + " pairs of parentheses");
        } else {
            System.out.printf("The string " + str1 + " is not a nesting of zero or more pairs of parentheses");
        }
    }

    public static int nestParent(String str1) {
        if (str1.length() == 0) {
            return 0;
        } else if (str1.charAt(0) == '(' && str1.charAt(str1.length() - 1) == ')') {
            int count = nestParent(str1.substring(1, str1.length() - 1));
            if (count == -1) {
                return -1;
            } else {
                return count + 1;
            }
        } else {
            return -1;
        }
    }
}
