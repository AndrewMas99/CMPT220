//Andrew Masone
/*
Create a subclass called Square that extends Shape and contains:
i. A constructor that creates a Square with the specified width
ii. A constructor that creates a Circle with the specified width, color, and filled property.
iii. A method named area() that returns the area of the square (https://thirdspacelearning.
com/gcse-maths/geometry-and-measure/area-of-a-rectangle/).
iv. A method named perimeter() that returns the perimeter of the square (https://thirdspacelearning.
com/gcse-maths/geometry-and-measure/how-to-work-out-perimeter/).
v. A method named toString() that returns a string representation of the square including all
the fields, area and perimeter.
*/
public class Square extends Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public Square(double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area() {
        return width * width;
    }

    public double perimeter() {
        return 4 * width;
    }

    public String toString() {
        return "Square [color=" + getColor() + ", filled=" + isFilled() + ", width=" + width + ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}

