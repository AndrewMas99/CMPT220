//Andrew Masone

/*
-Problem Description-
Design a class named MyInteger. The class contains:
* An int data field named value that stores the int value represented by this object.
* A constructor that creates a MyInteger object for the specified int value.
* A get method that returns the int value.
* Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime,
respectively.
* Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value
is even, odd, or prime, respectively.
* Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true
if the specified value is even, odd, or prime, respectively.
* Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to
the specified value.
* A static method parseInt(char[]) that converts an array of numeric characters to an int value.
* A static method parseInt(String) that converts a string into an int value.
//
1. Draw the UML.pdf diagram for the class.
2. Implement the class.
3. Write a client program that tests all methods in the class. No need to ask for user input.
4. Comment your code.
5. Format your code.
//
UML.pdf.pdf
Project1.java
MyInteger.java
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Project1 {
    public static void main(String[] args) {

    //Test the constructor and getValue method
        //Scanner sc1 = new Scanner(System.in);
        //int num1 = sc1.nextInt();
        MyInteger num1 = new MyInteger((int) (Math.random()*10));
        int num2 = (int) (Math.random()*10);  //Non MyInteger Object
        MyInteger num3 = new MyInteger((int) (Math.random()*100));

        //Values
        System.out.println("Values of all 4 num");
        System.out.println("num1 value: " + num1.getValue());
        System.out.println("num2 value: " + num2);
        System.out.println("num3 value: " + num3.getValue());
        System.out.println();

        //Test the isEven, isOdd, and isPrime methods
        System.out.println("MyInteger Objects isEven, isOdd, isPrime");
        System.out.println("Is num1 even? " + MyInteger.isEven(num1));
        System.out.println("Is num1 odd? " + MyInteger.isOdd(num1));
        System.out.println("Is num1 prime? " + MyInteger.isPrime(num1));
        System.out.println();

        //Test the non MyInteger objects for isEven, isOdd, and isPrime methods
        System.out.println("NOT MyInteger Objects isEven, isOdd, isPrime");
        System.out.println("Is num2 even? " + MyInteger.isEven(num2));
        System.out.println("Is num2 odd? " + MyInteger.isOdd(num2));
        System.out.println("Is num2 prime? " + MyInteger.isPrime(num2));
        System.out.println();

        //Test the static isEven, isOdd, and isPrime methods with MyInteger object as parameter
        System.out.println("Can show that both as an object or not isEven, isOdd, isPrime work");
        System.out.println("Is num3 even? " + MyInteger.isEven(num3));
        System.out.println("Is num3 odd? " + MyInteger.isOdd(num3));
        System.out.println("Is num3 prime? " + MyInteger.isPrime(num3));
        System.out.println();

        //Test the equals methods
        System.out.println("This shows the equals method properly works");
        System.out.println("Is num1 equal to num4? " + num1.equals(num3));
        System.out.println();

        //Test the static parseInt methods
        char[] charArr = {'1', '2', '3', '4', '5'}; //Array of characters
        String string1 = "67890";
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(charArr));
        System.out.println("parseInt(String): " + MyInteger.parseInt(string1));

    }
}
