package IllegalTriangleExceptionLab;

public class IllegalTriangleException extends Exception {
    private double side1, side2, side3;

    public IllegalTriangleException(double s1, double s2, double s3) {
        super("Illegal triangle.");
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }
}
