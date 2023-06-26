//Andrew Masone

public abstract class ShapeAbstract {
    private String color;
    private boolean filled;

    public ShapeAbstract() {
        this.color = "unknown";
        this.filled = false;
    }

    public ShapeAbstract(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract String toString();


    //b
    public interface Shape2DInterface {
        double getArea();

        double getPerimeter();
    }

    public abstract class Shape2D extends ShapeAbstract implements Shape2DInterface {
        public Shape2D() {
            super();
        }

        public Shape2D(String color, boolean filled) {
            super(color, filled);
        }
    }


    public interface Shape3DInterface {
        double getVolume();

        double getSurfaceArea();
    }

    public abstract class Shape3D extends ShapeAbstract implements Shape3DInterface {
        public Shape3D() {
            super();
        }

        public Shape3D(String color, boolean filled) {
            super(color, filled);
        }
    }

    public class Circle extends Shape2D {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }


        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }


        public String toString() {
            return "Circle[Radius=" + radius + ",Color=" + getColor() + ",Filled=" + isFilled() + "]";
        }
    }

    public class Square extends Shape2D {
        private double width;

        public Square(double width) {
            this.width = width;
        }

        public Square(double width, String color, boolean filled) {
            super(color, filled);
            this.width = width;
        }

        public double getArea() {
            return width * width;
        }

        public double getPerimeter() {
            return 4 * width;
        }

        public String toString() {
            return "Square[Width=" + width + ",Color=" + getColor() + ",Filled=" + isFilled() + "]";
        }
    }

    public abstract class Cylinder extends Shape3D {
        private double radius;
        private double height;

        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        public Cylinder(double radius, double height, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
            this.height = height;
        }


        public double getVolume() {
            return Math.PI * radius * radius * height;
        }


        public double getSurfaceArea() {
            return 2 * Math.PI * radius * (radius + height);
        }


    }
}
