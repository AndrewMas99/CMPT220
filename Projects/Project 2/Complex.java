//Andrew Masone

public class Complex implements Cloneable, Comparable<Complex> {
    private double a; // real part
    private double b; // imaginary part

    // Constructor that divides 2 parts of complex into a (real num) and b (imaginary num)
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Method for addition
    public Complex add(Complex cd) {
        double real = this.a + cd.a;
        double imag = this.b + cd.b;
        return new Complex(real, imag);
    }

    // Method to subtract
    public Complex subtract(Complex cd) {
        double real = this.a - cd.a;
        double imag = this.b - cd.b;
        return new Complex(real, imag);
    }

    // Method to multiply
    public Complex multiply(Complex cd) {
        double real = (this.a * cd.a) - (this.b * cd.b);
        double imag = (this.a * cd.b) + (this.b * cd.a);
        return new Complex(real, imag);
    }

    // Method to divide
    public Complex divide(Complex cd) {
        double denominator = (cd.a * cd.a) + (cd.b * cd.b);
        double real = ((this.a * cd.a) + (this.b * cd.b)) / denominator;
        double imag = ((this.b * cd.a) - (this.a * cd.b)) / denominator;

        // Rounding real and imaginary parts to 4 decimal places
        real *= 10000;real = (int) real;real /= 10000;
        imag *= 10000;imag = (int) imag;imag /= 10000;
        return new Complex(real, imag);
    }

    // Method for absolute value
    public double abs() {
        double magnitude = Math.sqrt((this.a * this.a) + (this.b * this.b));
        // Rounding magnitude to 4 decimal places
        magnitude *= 10000;magnitude = (int) magnitude;magnitude /= 10000;
        return magnitude;
    }

    // Method to return a string of complex number
    public String toString() {
        if (this.b == 0) {
            return Double.toString(this.a);
        } else if (this.a == 0) {
            return this.b + "i";
        } else if (this.b < 0) {
            return this.a + " - " + (-this.b) + "i";
        } else {
            return this.a + " + " + this.b + "i";
        }
    }

    // Method to create a copy of a complex number
    public Complex clone() {
        return new Complex(this.a, this.b);
    }

    // Method to compare two complex numbers based on their magnitudes
    public int compareTo(Complex cd) {
        if (this.abs() < cd.abs()) {
            return -1;
        } else if (this.abs() > cd.abs()) {
            return 1;
        } else {
            return 0;
        }
    }

}