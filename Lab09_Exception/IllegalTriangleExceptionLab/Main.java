package IllegalTriangleExceptionLab;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            Triangle t1 = new Triangle(1.5,2,3);
            System.out.println("Perimeter for t1: " + t1.getPerimeter());
            System.out.println("Area for t1: " + t1.getArea());

            Triangle t2 = new Triangle(1,2,3);
            System.out.println("Perimeter for t2: " + t2.getPerimeter());
            System.out.println("Area for t2: " + t2.getArea());

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
            System.out.println("Sides: " + e.getSide1() + ", " + e.getSide2() + ", " + e.getSide3());
        }

    }
}
