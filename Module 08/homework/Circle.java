//Andrew Masone
/*
 Create a subclass called Circle that extends Shape and contains:
i. A data field named radius of the double type with getter and setter methods.
ii. A constructor that creates a Circle with the specified radius
iii. A constructor that creates a Circle with the specified radius, color, and filled property.
iv. A method named area() that returns the area of the circle (https://thirdspacelearning.
com/gcse-maths/geometry-and-measure/area-of-a-circle/).
v. A method named circumference() that returns the circumference of the circle (https://
thirdspacelearning.com/gcse-maths/geometry-and-measure/circumference-of-a-circle/).
vi. A method named toString() that returns a string representation of the circle including all
the fields, area and perimeter.
*/
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle [radius=" + radius + ", color=" + getColor() + ", filled=" + isFilled()
                + ", area=" + area() + ", circumference=" + circumference() + "]";
    }
}

