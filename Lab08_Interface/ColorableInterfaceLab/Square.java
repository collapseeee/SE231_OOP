package ColorableInterfaceLab;

public class Square extends GeometricObject implements Colorable{
    //Attribute:
    private double side;

    //Constructor:
    public Square() {
        super();
        side = 0;
    }
    public Square(double side) {
        super();
        this.side = side;
    }

    //Method:
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return 4 * side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}
