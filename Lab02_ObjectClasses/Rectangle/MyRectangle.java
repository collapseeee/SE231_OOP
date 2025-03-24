public class MyRectangle {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(5,5);

        System.out.println("square: " + square.getWidth() + " x " + square.getWidth());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        Rectangle non_square = new Rectangle(8,5);

        System.out.println("\nnon_square: " + non_square.getHeight() + " x " + non_square.getWidth());
        System.out.println("Area: " + non_square.getArea());
        System.out.println("Perimeter: " + non_square.getPerimeter());
    }
}
