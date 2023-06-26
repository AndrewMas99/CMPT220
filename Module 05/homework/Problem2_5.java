//Andrew Masone
/*
Write the following method that returns a new string in which the letters in each word have the case
        reversed.
public static void reverseCase(String s)
        Write a test program that prompts the user to enter a string and invokes this method, and displays
        the return value from this method. Here is a sample run:
        Enter a string: London England 2015
        The new string is: lONDON eNGLAND 2015
        Note that words may be separated by multiple blank spaces.
*/

import java.util.Scanner;

public class Problem2_5 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string1 = sc1.nextLine();
        String string2 = reverseCase(string1);
        System.out.println("The new string is: ");
        System.out.print(string2);
    }
    public static String reverseCase(String string1) {
        StringBuilder sb = new StringBuilder();
        String[] words = string1.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                String first = word.substring(0, 1).toLowerCase();
                String last = word.substring(1).toUpperCase();
                sb.append(first).append(last);
                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}