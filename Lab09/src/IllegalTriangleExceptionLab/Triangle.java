package IllegalTriangleExceptionLab;

public class Triangle {
    private double side1, side2, side3, perimeter, area;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if ((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.perimeter = side1 + side2 + side3;
            double s = 0.5*(side1+side2+side3); // declare semi perimeter for area calculation.
            this.area = (Math.pow((s*(s-side1)*(s-side2)*(s-side3)), 0.5));;
        } else {
            throw new IllegalTriangleException(side1, side2, side3);
        }
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }
    public double getPerimeter() {
        return perimeter;
    }
    public double getArea() {
        return area;
    }
}
