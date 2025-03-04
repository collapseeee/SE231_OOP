package ComparableCircleInterfaceLab;

public class ComparableCircle extends Circle implements Comparable {
    private double radius;

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle circle) {
        if (this.getRadius() > circle.getRadius()) {
            return 1;
        } else if (this.getRadius() == circle.getRadius()) {
            return 0;
        } else {
            return -1;
        }
    }

}
