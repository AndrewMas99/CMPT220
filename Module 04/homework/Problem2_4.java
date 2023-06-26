//Andrew Masone
/*The square root of any number might be approximated by what’s called the Babylonian method. The
        method is as follows:
        (a) Start with an initial guess n.
        (b) If n is close enough to the square root of the number, stop. The answer is n.
        (c) Otherwise, make a new guess by averaging n and the number divided by n.

        It can also be represented as:
        (a) x0 ≈√S
        (b) xn+1 =1/2(xn + S/xn)
        (c) √S = limn→∞ xn

        Write a program that prompts the user to enter a positive integer and displays the square root of the
        integer. Your program should use a loop to repeatedly make a guess until the guess is close enough to
        the square root of the number.

        Use the following criteria to determine when to stop the loop:
        |xn+1 − xn| < ε             where ε is 0.0000001.
 */

import java.util.Scanner;

public class Problem2_4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        double number = sc1.nextInt();
        while(number<0){
            System.out.println("Please enter a positive number");
            number=sc1.nextInt();
        }
        double sqrt = 1.0;
        while (Math.abs(sqrt * sqrt - number) > 0.0000001) {
            sqrt = (number / sqrt + sqrt) / 2;
        }
        System.out.println(sqrt);
    }
}
