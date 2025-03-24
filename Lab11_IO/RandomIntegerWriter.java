import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Collections;

public class RandomIntegerWriter {
    public static void main(String[] args) {
        String fileName = "RWdata.txt";
        try {
            Scanner fileInput = new Scanner(new File("src/"+fileName));
            System.out.println("File " + fileName + " exists.");
            ArrayList<Integer> intList = new ArrayList<>();
            while (fileInput.hasNextInt()) {
                intList.add(fileInput.nextInt());
            }
            System.out.println("\nAll elements from the file " + fileName + " (unsorted):");
            printAllElementInArrayList(intList);

            Collections.sort(intList);
            System.out.println("\nAll elements from the file " + fileName + " (sorted):");
            printAllElementInArrayList(intList);


        } catch (FileNotFoundException e) {
            System.out.println("The file with the name `" + fileName + "` does not exist.");
            System.out.println("Creating a new file with the name `" + fileName + "`.");
            System.out.println(" . . . . . . . . . . . . . . . ");

            try (PrintWriter writer = new PrintWriter(new File("src/"+fileName))) {
                for (int i = 0; i < 100; i++) {
                    writer.print(randomAnInteger() + " ");
                }
                System.out.println("File created with 100 random integers successfully!");
            } catch (IOException er) {
                System.out.println("An error occurred while creating the file.");
            }

        } catch (NumberFormatException e) {
            System.out.println("The file contains non-integer data. Please ensure the file only contains integers.");
            System.exit(1);
        }
    }
    public static int randomAnInteger() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }
    public static void printAllElementInArrayList(ArrayList<Integer> integerArrayList) {
        for (int i=1; i<=integerArrayList.size(); i++) {
            System.out.print(integerArrayList.get(i-1) + " ");
            if (i%20==0) {
                System.out.println();
            }
        }
    }
}
