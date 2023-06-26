//Andrew Masone
/*
If z1, z2, z3 are three noncollinear points in the complex space, then the directed or signed area A(z1, z2, z3)
of the triangle with these vertices is given by
                    |z1 z1 1|
A(z1, z2, z3) = i/4 |z2 z2 1|
                    |z3 z3 1|
(1)
Write a program that takes three points specified by their x and y coordinates and calculates the area
using complex numbers. Assume that zn = xn + yni. Compare your result with the formula we used
previously in class to calculate the area of a triangle. Call your program Extra.java.
Note: Use https://en.wikipedia.org/wiki/Determinant to solve equation (1).

 */
import java.util.Scanner;
public class ExtraCred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the coordinates of the three points
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        /**/

        //Static input, should equal 18
        /*
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 6;
        double x3 = 6;
        double y3 = 0;
        /**/

        // Calculate the area using complex numbers
        double real1 = x1 - x3;
        double imag1 = y1 - y3;
        double real2 = x2 - x3;
        double imag2 = y2 - y3;
        double area = 0.5 * Math.abs(real1 * imag2 - imag1 * real2);

        // Print the result
        System.out.println("(1/2) * (|" + real1 + " * " + imag2 + " - " + imag1 + " * " + real2 + "|)");

        System.out.println("The area of the triangle is " + area);
    }
}
