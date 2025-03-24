import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.util.Vector;

public class ScoreProcessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = "src/"+input.nextLine();
        Vector<Double> scores = new Vector<>();
        double totalScore, avgScore, score;
        totalScore = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while (true) {
                String line = reader.readLine();
                if (line != null) {
                    String[] tokens = line.split(" ");
                    for (String token : tokens) {
                        score = Double.parseDouble(token);
                        totalScore += score;
                        scores.add(score);
                    }
                } else {
                    break;
                }
            }
            avgScore = totalScore/scores.size();
            System.out.println("Total Score: " + totalScore);
            System.out.println("Average Score: " + avgScore);
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("Filename " + filename + " not found. Please try again.");
        } catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("There is an invalid score in the file.");
        }
    }
}