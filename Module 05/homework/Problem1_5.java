//Andrew Masone
/*
Write a method that calculates the factorial of an integer. Use the following method header:
public static long factorial(int n)
For example, factorial(5) returns 120 (= 5 × 4 × 3 × 2 × 1). Write a test program that prompts
the user to enter an integer and displays its factorial by using the method created. Hint: Factorial is
defined as follows:
factorial(0) = 1
factorial(1) = 1
factorial(n) = n * factorial(n - 1) for n > 1
Use a loop to compute the factorial.
*/

import java.util.Scanner;

public class Problem1_5 {
    public static void main (String[]args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n1 = sc1.nextInt();
        while (n1 < 0) {
            System.out.println("Input must be positive.");
            n1 = sc1.nextInt();
        }
        int factorial = factorial(n1);
        System.out.println(factorial +" = "+ "Factorial("+n1+")");
    }

    public static int factorial(int n2) {
        //System.out.println(n2);
        if (n2 == 0 || n2 == 1) {
            return 1;
        }
        else {
            return n2 * factorial(n2 - 1);

        }
    }
}