//Andrew Masone
/*
The Complex Class

Problem Description
A complex number is a number of the form a+bi, where a and b are real numbers and i is √
−1. The numbers
a and b are known as the real part and imaginary part of the complex number, respectively. You can perform
addition, subtraction, multiplication, and division for complex numbers using the following formula:
a + bi + c + di = (a + c) + (b + d)i
a + bi − (c + di) = (a − c) + (b − d)i
(a + bi) ∗ (c + di) = (ac − bd) + (bc + ad)i
(a + bi)/(c + di) = (ac + bd)/(c^2 + d^2) + (bc − ad)i/(c^2 + d^2)
You can also obtain the absolute value for a complex number using the following formula:
|a + bi| = sqrt(a2 + b2)

Deliverables
1. Create a UML diagram of a class named Complex that extends the Number class for representing
complex numbers. 15 Points
2. Implement the class in Java (Complex.java) and add the following methods:
(a) add, subtract, multiply, divide, abs for performing complex-number operations. 15 Points
(b) Override toString method for returning a string representation for a complex number. The
toString method returns a + bi as a string. If b is 0, it simply returns a. 15 Points
3. Provide three constructors Complex(a,b), Complex(a), and Complex(). Complex() creates a Complex
object for number 0 and Complex(a) creates a Complex object with 0 for b. 15 Points
4. Provide the getRealPart() and getImaginaryPart() methods for returning the real and imaginary
part of the complex number, respectively. 15 Points
5. Implement the Cloneable and Comparable interfaces.
6. Create Java program called Project4.java that prompts the user to enter two complex numbers and
display the result of their addition, subtraction, multiplication, and division. 15 Points
Here is a sample run:
Enter the first complex number: 3.5 5.5
Enter the second complex number: -3.5 1
(3.5 + 5.5i) + (-3.5 + 1.0i) = 0.0 + 6.5i
(3.5 + 5.5i) - (-3.5 + 1.0i) = 7.0 + 4.5i
1
(3.5 + 5.5i) * (-3.5 + 1.0i) = -17.75 + -15.75i
(3.5 + 5.5i) / (-3.5 + 1.0i) = -0.5094 + -1.7i
|3.5 + 5.5i| = 6.519202405202649
7. Comment your code. 10 Points

Submission
Submit the following items:
1. Create a PDF file with the UML diagram and submit to GitHub.
2. Compile, test, and submit your Java program to GitHub (you must submit the program regardless
whether it’s complete or incomplete, correct or incorrect)
Place your .java file under the corresponding folder in your local copy of the GitHub repository,
commit and push it to the remote repository. Make sure that the professor has access to the repository
(jfac65-marist).
cmpt220lastname\
prj\
5\
Project5.pdf
Project5.java
Complex.java
 */

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first complex number:");
        System.out.print("Real part: ");
        double a = input.nextDouble();
        System.out.print("Imaginary part: ");
        double b = input.nextDouble();
        Complex num1 = new Complex(a, b);


        System.out.println("Enter the second complex number:");
        System.out.print("Real part: ");
        double c = input.nextDouble();
        System.out.print("Imaginary part: ");
        double d = input.nextDouble();
        Complex num2 = new Complex(c, d);
        /**/

        //Static input
        /*
        double a1 = 3.5;
        double b1 = 5.5;
        double a2 = -3.5;
        double b2 = 1;
        Complex num1 = new Complex(a1, b1);
        Complex num2 = new Complex(a2, b2);
        System.out.println("3.5, 5.5");
        System.out.println("-3.5, 1");
        System.out.println();
        /**/

        System.out.println("(" + num1 + ") + (" + num2 + ") = " + num1.add(num2));
        System.out.println("(" + num1 + ") - (" + num2 + ") = " + num1.subtract(num2));
        System.out.println("(" + num1 + ") * (" + num2 + ") = " + num1.multiply(num2));
        System.out.println("(" + num1 + ") / (" + num2 + ") = " + num1.divide(num2));
        System.out.println("|" + num1 + "| = "                  + num1.abs());
        System.out.println("|" + num2 + "| = "                  + num2.abs());
    }
}
/*
 * TODO:
 *  - implement error handling
 */

