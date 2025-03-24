public class TestShape {
    public static void main(String[] args) {
        //Create objects
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("red", true);
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(3, "blue", true);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4.0, 5.0);
        Rectangle rectangle3 = new Rectangle(6.0, 7.0, "green", true);
        //Print results
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println("Area: " + (circle2.getArea()));
        System.out.println("Perimeter " + (circle2.getPerimeter()));
        System.out.println(circle3.toString());
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println("Area: " + (rectangle2.getArea()));
        System.out.println("Perimeter: " + (rectangle2.getPerimeter()));
        System.out.println(rectangle3.toString());
    }
    // Subclasses
    static class Circle extends Shape {
        //Attributes
        private double radius;
        //Constructor
        public Circle() {
            super("white", false);
            this.radius = 1.0;
        }
        public Circle(double radius) {
            super("white", false);
            this.radius = radius;
        }
        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }
        //Methods
        public double getArea() {
            return Math.PI * radius * radius;
        }
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
        @Override
        public String toString() {
            return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString();
        }
    }

    static class Rectangle extends Shape {
        //Attributes
        private double width;
        private double length;
        //Constructor
        public Rectangle() {
            super("white", false);
            this.width = 1.0;
            this.length = 1.0;
        }
        public Rectangle(double width, double length) {
            super("white", false);
            this.width = width;
            this.length = length;
        }
        public Rectangle(double width, double length, String color, boolean filled) {
            super(color,filled);
            this.width = width;
            this.length = length;
        }
        public double getArea() {
            return width*length;
        }
        public double getPerimeter() {
            return 2 * (width+length);
        }
        @Override
        public String toString() {
            return "A Rectangle with width= " + width + " and length= " + length + ", which is a subclass of " + super.toString();
        }
    }
}
