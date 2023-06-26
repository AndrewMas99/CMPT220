//Andrew Masone
/*
Write a program that prompts the user to enter the size of the lists and two lists of numbers and
calculates the sum of the products of the corresponding elements of the two lists.
*/

import java.util.Scanner;

public class Problem2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the lists
        System.out.print("Enter the size of the lists: ");
        int size = input.nextInt();

        // Create the two lists
        int[] list1 = new int[size];
        int[] list2 = new int[size];

        // Prompt the user to enter the elements of the two lists
        System.out.println("Enter ints of the first list:");
        for (int i = 0; i < size; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter the ints of the second list:");
        for (int i = 0; i < size; i++) {
            list2[i] = input.nextInt();
        }

            int sum = 0;
            for (int i = 0; i < size; i++) {
                int product = list1[i] * list2[i];
                sum = sum + product;

                System.out.print("(" + list1[i] + " * " + list2[i] + ")");
                if (i<size-1) {
                    System.out.print(" + ");
                }
            }
            System.out.print(" = "+sum);
        }
    }

