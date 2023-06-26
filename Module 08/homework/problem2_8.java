//Andrew Masone
/*
Create and run the following program:
public class Problem2 {
public static void main(String[] args) {
Shape[] shapes = new Shape[3];
shapes[0] = new Cylinder(1.0, 3.0, "red", true);
shapes[1] = new Cube(4.0, "blue", false);
shapes[2] = new Cube(5.0, "green", true);
for (Shape shape : shapes) {
System.out.println(shape);
        }
    }
}
*/
public class problem2_8 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Cylinder(1.0, 3.0, "red", true);
        shapes[1] = new Cube(4.0, "blue", false);
        shapes[2] = new Cube(5.0, "green", true);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
