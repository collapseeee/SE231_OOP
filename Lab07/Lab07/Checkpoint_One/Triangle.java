public class Triangle extends GeometricObject {
    private boolean filled;
    private double[] side = new double[3];
    private String color = "white";
    private double area;
    private double perimeter;
    private double semiPerimeter;


    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side[0] = side1;
        this.side[1] = side2;
        this.side[2] = side3;
        perimeter = side1+side2+side3;
        semiPerimeter = perimeter/2;
        area = Math.pow((semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3)),0.5);
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }
    public double getArea() {
        return area;
    }
    public double getSide(int index) {
        return side[index];
    }

    public String getAllSide() {
        return (getSide(0) + " side2 = " + getSide(1) + " side3 = " + getSide(2));
    }

}
