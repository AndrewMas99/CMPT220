//Andrew Masone
/*
(a) Create a Java class called Shape that contains:
i. A data field named color of the String type with getter and setter methods.
ii. A data field named filled of the boolean type with getter and setter methods.
iii. A method named toString() that returns a string representation of the shape.
*/
public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
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

    public String toString() {
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
}

