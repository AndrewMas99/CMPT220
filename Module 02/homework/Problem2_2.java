//Andrew Masone
/*
Given the formula below for subtracting fractions, write a Java program that asks for the coefficients
and solves the equation:
a/b − c/d = (ad−bc)/bd
Your program should prompts the user to enter input for a, b, c and d, and displays the solution.
* */
import java.util.Scanner;

public class Problem2_2 {
    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = sc1.nextInt();
        System.out.print("Enter coefficient b: ");
        double b = sc1.nextInt();
        System.out.print("Enter coefficient c: ");
        double c = sc1.nextInt();
        System.out.print("Enter coefficient d: ");
        double d = sc1.nextInt();

        System.out.print("The solution is: ");
        System.out.print((a/b)-(c/d));
    }
}
