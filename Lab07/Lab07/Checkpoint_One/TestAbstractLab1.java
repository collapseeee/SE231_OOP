import java.util.Scanner;
import java.util.StringTokenizer;
public class TestAbstractLab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] sides = new double[3];
        int i = 0;
        System.out.print("Enter three sides: ");
        String inputSide = input.nextLine();
        StringTokenizer st = new StringTokenizer(inputSide, " ");
        while(st.hasMoreTokens()) {
            sides[i] = Double.parseDouble(st.nextToken());
            i++;
        }

        System.out.print("Enter the color: ");
        String color = input.nextLine();

        System.out.print("Enter a boolean value for filled: ");
        boolean filled;
        String filledInput = input.nextLine();
        if (filledInput.equalsIgnoreCase("true")) {
            filled = true;
        } else if (filledInput.equalsIgnoreCase("false")) {
            filled = false;
        } else {
            System.out.println("Please enter true or false.");
            return;
        }

        Triangle myTriangle = new Triangle(color, filled, sides[0], sides[1], sides[2]);
        // Result:
        System.out.println("The area is " + myTriangle.getArea());
        System.out.println("The perimeter is " + myTriangle.getPerimeter());
        System.out.println("myTriangle: side1 = " + myTriangle.getAllSide());

    }
}