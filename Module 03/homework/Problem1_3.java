//Andrew Masone

/*Write a Java program that will ask the user for an integer number and then print out the result using
        the following rules:
        (a) If the number is negative, print the square of the number.
        (b) If the number is positive, print the square root of the number.
        (c) If the number is zero, print the statement “The number is zero.”.
*/

import java.util.Scanner;
import java.lang.Math;

public class Problem1_3 {
    public static void main(String[]args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double number = sc1.nextInt();

        if(number>0){
            double newnumb=Math.pow(number,.5);
            System.out.println(newnumb);
        }
        if(number<0){
            double newnumb=number*number;
            System.out.println(newnumb);
        }
        if(number==0){
            System.out.println("Your number is zero");
        }
    }
}
