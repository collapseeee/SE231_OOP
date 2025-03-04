package InputMismatchLab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isIncorrect = true;
        do {
            try {
                System.out.print("Enter a double: ");
                int input1 = input.nextInt();
                int input2 = input.nextInt();
                int result = input1+input2;
                System.out.println("The number entered is " + result);
                isIncorrect = false;
            } catch (InputMismatchException e) {
                System.out.println("Try again. (Incorrect input: an integer is required");
                input.nextLine(); // discard the incorrect input
            }
        } while (isIncorrect);


    }
}
