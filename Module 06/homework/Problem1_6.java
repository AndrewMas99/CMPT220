//Andrew Masone
/*
Write a program that reads text from the user and returns a list of the characters that are in the text
together with a count of how many times each character appears. Ignore white spaces and punctuation
marks. (Hint: Use a char array to keep track of the characters and another array to store the counts
for each corresponding character.)
 */

import java.util.Scanner;

public class Problem1_6 {
    public static void main(String[]args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String str1 = sc1.nextLine();

        str1 = str1.replaceAll("[^a-zA-Z0-9]", ""); // accepts only A-Z, a-z, 0-9 and removes all other characters


        // Create two arrays to store character and its count
        char[] chars = new char[str1.length()];
        int[] counts = new int[str1.length()];
        int unique = 0; // Number of unique characters found so far

        for (int i1 = 0; i1 < str1.length(); i1++) {
            char c = str1.charAt(i1);

        // Check if this character already exists in the array
        int index = -1;
        for (int i2 = 0; i2 < unique; i2++) {
            if (chars[i2] == c) {
                index = i2;
                break;
            }
        }

        // If the character already exists increase
        // otherwise add it to the array with a count of 1
        if (index != -1) {
            counts[index]++;
        }
        else {
            chars[unique] = c;
            counts[unique] = 1;
            unique++;
        }
    }

        for (int i = 0; i < unique; i++) {
            System.out.println(chars[i] + ": " + counts[i]);
        }
        //System.out.println("unique= "+unique);
    }
}
