public class Rectangle {
    // Attributes:
    private float height;
    private float width;
    private float area;
    private float perimeter;

    // Constructors:
    Rectangle() {}
    Rectangle(float h, float w) {
        height = h;
        width = w;
        area = calculateArea(h, w);
        perimeter = calculatePerimeter(h, w);
    }

    // Behaviours:
    public int getHeight() { return (int) height; }
    public int getWidth() { return (int) width; }
    public float calculateArea(float h, float w) {
        return h*w;
    }
    public float calculatePerimeter(float h, float w) {
        return 2*(h+w);
    }
    public float getArea() { return area; }
    public float getPerimeter() { return perimeter; }

}