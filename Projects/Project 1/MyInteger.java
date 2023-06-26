//Andrew Masone

public class MyInteger {

    private int value; //The value stored

    public MyInteger(int value) {
        this.value = value;
    } //Constructor

    public int getValue() {
        return value;
    } //Getter from constructor

    public boolean isEven() {
        return value % 2 == 0;
    } //True for even or false is odd

    public boolean isOdd() {
        return value % 2 != 0;
    } //True for odd or false is even

    public boolean isPrime() {  //an O^2 form of accurately telling if the number is odd or even
        if (value < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    } //For telling if even without using MyInteger as an object

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    } //For telling if odd without using MyInteger as an object

    public static boolean isPrime(int value) {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }//For telling if prime without using MyInteger as an object

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }  //For telling if even with or without MyInteger Object

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }//For telling if odd with or without MyInteger Object

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }//For telling if prime with or without MyInteger Object

    public boolean equals(int value) {
        return this.value == value;
    } //Takes a number and related them: num1.equals(num2) True or False both Having to be MyInteger Objects

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.getValue();
    }//Takes a number and related them: num1.equals(num2) True or False without Having to be MyInteger Objects
    public static int parseInt(char[] chars) {//takes either a string or array and combines the characters and then effectively converts it into a string, 3 numbers will always be a number between 100 - 999
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result * 10 + (chars[i] - '0'); //Will error if not given numerical characters
        }
        return result;
    } //

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    } //basically sends it to the other parseInt method
}
