// Base class Shape
public class Shape {
    private String color;
    private boolean filled;

    // Default constructor
    public Shape() {
        this("white", false); // Default color white and not filled
    }

    // Parameterized constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and setters
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

    // toString method
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " +
                (filled ? "filled" : "not filled");
    }
}
