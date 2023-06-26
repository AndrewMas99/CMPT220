//Andrew Masone
/*
 Create a class called Cube that extends Square that contains:
i. A constructor that creates a Cube with the specified width.
ii. A constructor that creates a Cube with the specified width, color, and filled property.
iii. A method named area() that returns the total surface area (TSA) of the cube (https:
//mathmonks.com/cube#Surface_Area).
iv. A method named volume() that returns the volume of the cube (https://thirdspacelearning.
com/gcse-maths/geometry-and-measure/volume/).
v. A method named toString() that returns a string representation of the cube including all
the fields, area and volume.
*/
public class Cube extends Square {
    public Cube(double side) {
        super(side);
    }

    public Cube(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    public double area() {
        return 6 * super.area();
    }

    public double volume() {
        return super.area() * getWidth();
    }

    public String toString() {
        return "Cube [side=" + getWidth() + ", color=" + getColor() + ", filled=" + isFilled()
                + ", surface area=" + area() + ", volume=" + volume() + "]";
    }
}

