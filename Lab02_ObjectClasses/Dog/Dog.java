public class Dog {
    // Attributes:
    private String color;
    private float weight;

    // Constructors:
    Dog() {
        color = "Unknown";
        weight = 0.0f;
    }
    Dog(String c, float w) {
        color = c;
        weight = w;
    }

    // Method:

    public String getColor() { return color; }
    public float getWeight() { return weight;}
}
