//Andrew Masone

/*
Make the following changes to last week’s homework:
(a) Modify your Shape class from the previous homework and make it into an abstract class.
(b) Create the following interfaces:
i. Shape3DInterface with methods getVolume() and getSurfaceArea().
ii. Shape2DInterface with methods getArea() and getPerimeter().
(c) Create an abstract class named Shape2D that implements the Shape2DInterface.
(d) Create an abstract class named Shape3D that implements the Shape3DInterface.
(e) Modify the Circle, Square, Cylinder, and Cube classes to extend the appropriate abstract class.
(f) Create and run the following test class:
// Problem2.java
import java.util.ArrayList;
public class Problem2 {
public static void main(String[] args) {
ArrayList<Shape> shapes = new ArrayList<>();
shapes.add(new Circle(5));
shapes.add(new Square(5));
shapes.add(new Cylinder(5, 10));
shapes.add(new Cube(5));
for (Shape shape : shapes) {
if (shape instanceof Shape2D) {
System.out.println("This is a 2D shape");
System.out.println("Area: " + ((Shape2D)shape).getArea());
System.out.println("Perimeter: "
+ ((Shape2D)shape).getPerimeter());
}
else if (shape instanceof Shape3D) {
System.out.println("This is a 3D shape");
System.out.println("Volume: " + ((Shape3D)shape).getVolume());
System.out.println("Surface Area: "
+ ((Shape3D)shape).getSurfaceArea());
}
System.out.println(shape);
}
}
}
 */

// Problem2.java
/*
import java.util.ArrayList;
public class problem2_9 {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Square(5));
        shapes.add(new Cylinder(5, 10));
        shapes.add(new Cube(5));
        for (Shape shape : shapes) {
            if (shape instanceof ShapeAbstract.Shape2D) {
                System.out.println("This is a 2D shape");
                System.out.println("Area: " + ((ShapeAbstract.Shape2D)shape).getArea());
                System.out.println("Perimeter: "
                        + ((ShapeAbstract.Shape2D)shape).getPerimeter());
            }
            else if (shape instanceof ShapeAbstract.Shape3D) {
                System.out.println("This is a 3D shape");
                System.out.println("Volume: " + ((ShapeAbstract.Shape3D)shape).getVolume());
                System.out.println("Surface Area: "
                        + ((ShapeAbstract.Shape3D)shape).getSurfaceArea());
            }
            System.out.println(shape);
        }
    }
}

 */