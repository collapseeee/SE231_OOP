package ComparableCircleInterfaceLab;

public class Main {

    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(15);

        int flag = c1.compareTo(c2);
        switch (flag) {
            case 1:
                System.out.println("The max circle's radius is " + c1.getRadius());
                break;
            case -1:
                System.out.println("The max circle's radius is " + c2.getRadius());
                break;
            default:
                System.out.println("Both circles are have the same radius.");
                break;
        }
    }
}
