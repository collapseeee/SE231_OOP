package ArrayIndexOutOfBoundLab;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        try {
            System.out.print("Please enter index of array(0-99) : ");
            int index = input.nextInt();
            System.out.println("Value at index is " + array[index]);
        } catch (InputMismatchException e) {
            System.out.println("Please enter an integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You refer to index that does not exist.");
        } finally {
            System.out.println("Continuing processing ...");
        }
    }
}
