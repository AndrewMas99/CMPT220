//Andrew Masone
/*
Create a class called Cylinder that extends Circle that contains:
i. A data field named height of the double type with getter and setter methods.
ii. A constructor that creates a Cylinder with the specified height and radius.
iii. A constructor that creates a Cylinder with the specified height, radius, color, and filled
property.
iv. A method named area() that returns the total surface area (TSA) of the cylinder (https:
//mathmonks.com/cylinder/surface-area-of-a-cylinder).
v. A method named volume() that returns the volume of the cylinder (https://thirdspacelearning.
com/gcse-maths/geometry-and-measure/volume/).
vi. A method named toString() that returns a string representation of the cylinder including
all the fields, area and volume.
*/
public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return 2 * super.area() + circumference() * height;
    }

    public double volume() {
        return super.area() * height;
    }

    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", height=" + height + ", color=" + getColor() + ", filled="
                + isFilled() + ", surface area=" + area() + ", volume=" + volume() + "]";
    }
}

